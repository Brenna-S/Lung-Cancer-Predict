import java.util.ArrayList;
import java.util.List;

public class DataSet {

    private List<Instance> instances;

    // Constructor
    public DataSet() {
        instances = new ArrayList<>();
    }

    // Add an instance to the dataset
    public void addInstance(Instance instance) {
        instances.add(instance);
    }

    // Check if all instances have the same label (pure dataset)
    public boolean isPure() {
        String label = instances.get(0).getLabel();
        for (Instance instance : instances) {
            if (!instance.getLabel().equals(label)) {
                return false;
            }
        }
        return true;
    }

    // Find the best attribute to split on
    public String bestSplitAttribute() {
        // Simplified: assume we always split on the first attribute (for demonstration)
        return instances.get(0).getAttributes().get(0);
    }

    // Split the dataset into two subsets based on an attribute
    public DataSet[] split(String attribute) {
        DataSet left = new DataSet();
        DataSet right = new DataSet();
        
        for (Instance instance : instances) {
            if (instance.getAttributeValue(attribute).equals("Yes")) {
                left.addInstance(instance);
            } else {
                right.addInstance(instance);
            }
        }
        
        return new DataSet[] { left, right };
    }

    // Create a bootstrap sample (for Random Forest)
    public DataSet bootstrapSample() {
        DataSet sample = new DataSet();
        for (int i = 0; i < instances.size(); i++) {
            int randomIndex = (int) (Math.random() * instances.size());
            sample.addInstance(instances.get(randomIndex));
        }
        return sample;
    }
}