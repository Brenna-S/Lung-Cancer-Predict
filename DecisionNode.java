public class DecisionNode extends TreeNode {

    private String attribute;
    private TreeNode left;
    private TreeNode right;

    // Constructor
    public DecisionNode(String attribute) {
        this.attribute = attribute;
    }

    // Getters and setters
    public String getAttribute() {
        return attribute;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    // Method to make a prediction
    @Override
    public String predict(Instance instance) {
        String attributeValue = instance.getAttributeValue(attribute);
        if (attributeValue.equals("Yes")) {
            return left.predict(instance);
        } else {
            return right.predict(instance);
        }
    }
}
