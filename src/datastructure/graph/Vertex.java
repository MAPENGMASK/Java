package datastructure.graph;

/**
 * 定点类
 */
public class Vertex {
    private String value;
    public boolean visited;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Vertex(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }
}
