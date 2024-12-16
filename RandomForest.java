import java.util.ArrayList;
import java.util.List;

public class RandomForest {

    private List<DecisionTree> trees;

    // Constructor
    public RandomForest(int numTrees) {
        trees = new ArrayList<>();
        for (int i = 0; i < numTrees; i++) {
            trees.add(new DecisionTree());
        }
    }

    // Build the Random Forest
    public void buildForest(DataSet data) {
        for (DecisionTree tree : trees) {
            DataSet bootstrapSample = data.bootstrapSample();
            tree.buildTree(bootstrapSample);
        }
    }

    // Predict using the Random Forest (majority voting)
    public String predict(Instance instance) {
        int yesVotes = 0;
        int noVotes = 0;

        for (DecisionTree tree : trees) {
            String prediction = tree.predict(instance);
            if (prediction.equals("YES")) {
                yesVotes++;
            } else {
                noVotes++;
            }
        }

        return (yesVotes > noVotes) ? "YES" : "NO";
    }
}