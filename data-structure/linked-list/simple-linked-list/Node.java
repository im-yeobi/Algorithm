package simple_linked_list;

import java.util.Objects;

/**
 * @author yeobi Created 2020-02-21
 * @description 데이터와 다음 노드를 참조하는 링크를 가지고 있는 객체
 */
public class Node {

    private Data data;
    private Node next;

    public Node() {
    }

    public Node(Data data) {
        this.data = data;
    }

    public boolean isNextNull() {
        return Objects.isNull(next);
    }

    public void updateNext(Node node) {
        this.next = node;
    }

    public void updateNode(Data data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Data getData() {
        return data;
    }

    public int compareData(Node node) {
        return this.getData().compareValue(node.getData());
    }

    @Override
    public String toString() {
        return "[" + data.getValue() + "|" + (isNextNull() ? "null" : "node") + "]";
    }

}
