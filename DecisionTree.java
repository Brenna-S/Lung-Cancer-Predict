public class DecisionTree {

    private TreeNode root;

    // Constructor
    public DecisionTree() {
        this.root = null;
    }

    // Method to build the decision tree
    public void buildTree(DataSet data) {
        root = buildNode(data);
    }

    // Recursive method to build tree nodes
    private TreeNode buildNode(DataSet data) {
        if (data.isPure()) {
            return new LeafNode(data);
        }

        // Find the best attribute to split on
        String bestAttribute = data.bestSplitAttribute();
        DataSet[] splitData = data.split(bestAttribute);
        
        // Create decision nodes for each branch
        DecisionNode decisionNode = new DecisionNode(bestAttribute);
        decisionNode.setLeft(buildNode(splitData[0]));
        decisionNode.setRight(buildNode(splitData[1]));

        return decisionNode;
    }

    // Method to predict the label for a given instance
    public String predict(Instance instance) {
        return root.predict(instance);
    }
}
