package simple_linked_list;

/**
 * @author yeobi Created 2020-02-21
 */
public interface LinkedList {

    void init();

    boolean readFirst(Node node);

    boolean readNext(Node node);

    void insert(Node newNode);

    Node remove(Node node);

    int getCount();

}
