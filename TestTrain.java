import java.util.List;

public class Instance {

    private List<String> attributes;
    private String label;

    // Constructor
    public Instance(List<String> attributes, String label) {
        this.attributes = attributes;
        this.label = label;
    }

    // Get the value of a specific attribute
    public String getAttributeValue(String attribute) {
        // Simplified: assume attributes are stored in order
        return attributes.get(0);  // Just returns the first attribute for this demo
    }

    // Get the label (target value)
    public String getLabel() {
        return label;
    }

    // Get the list of attributes
    public List<String> getAttributes() {
        return attributes;
    }
}