package priority_queue;

/**
 * @author yeobi Created 2020-02-22
 */
public class Node {

    private Data data;

    private Node(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
    }

    public static Node createNode(Data data) {
        return new Node(data);
    }

    @Override
    public String toString() {
        return "[" + data.getValue() + "]";
    }

}
