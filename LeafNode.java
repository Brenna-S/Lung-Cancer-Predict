public class LeafNode extends TreeNode {

    private String label;

    // Constructor
    public LeafNode(DataSet data) {
        this.label = data.getLabel(); // Simplified: assume single label at leaf
    }

    // Method to make a prediction
    @Override
    public String predict(Instance instance) {
        return label;
    }
}