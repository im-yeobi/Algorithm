import org.junit.Before;
import org.junit.Test;
import simple_linked_list.Data;
import simple_linked_list.Node;
import simple_linked_list.SimpleLinkedList;

/**
 * @author yeobi Created 2020-02-21
 */
public class SimpleLinkedListTest {

    private SimpleLinkedList list;
    Node dummyNode;

    @Before
    public void setUp() {
        dummyNode = new Node(new Data());
        list = new SimpleLinkedList();
        list.init();
    }

    @Test
    public void readFirst() {
        if (list.readFirst(dummyNode)) {
            System.out.println(dummyNode);
        }
    }

    @Test
    public void readNext() {
        if (list.readNext(dummyNode)) {
            System.out.println(dummyNode);
        }
    }

    @Test
    public void insert() {
        list.insert(new Node(new Data(10)));
        list.insert(new Node(new Data(2)));

        if (list.readFirst(dummyNode)) {
            System.out.println(dummyNode);
            if (list.readNext(dummyNode)) {
                System.out.println(dummyNode);
            }
        }
    }

    @Test
    public void remove() {
        System.out.println("[노드 추가]");
        list.insert(new Node(new Data(10)));
        list.insert(new Node(new Data(2)));
        list.insert(new Node(new Data(5)));
        list.insert(new Node(new Data(6)));
        list.insert(new Node(new Data(1)));
        list.insert(new Node(new Data(19)));
        readAll();

        System.out.println();
        System.out.println("[노드 삭제]");
        Node remove = list.remove(new Node(new Data(10)));
        System.out.println("삭제 노드 : " + remove);
        readAll();
    }

    private void readAll() {
        System.out.println("[단순 연결 리스트 전체 조회]");
        if (list.readFirst(dummyNode)) {
            System.out.print(dummyNode);
            while (list.readNext(dummyNode)) {
                System.out.print(" -> " + dummyNode);
            }
        }
        System.out.println();
    }

}
