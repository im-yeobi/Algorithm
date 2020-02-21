package simple_linked_list;

import java.util.Objects;

/**
 * @author yeobi Created 2020-02-21
 * @description 단순 연결 리스트 구현
 */
public class SimpleLinkedList implements LinkedList {

    Node head;
    Node cur;
    int count;

    @Override
    public void init() {
        // dummy Node
        head = new Node();
        cur = head;
    }

    @Override
    public boolean readFirst(Node node) {
        if (head.isNextNull()) {
            System.out.println("연결 리스트에 데이터가 없습니다.");
            return false;
        }

        cur = head.getNext();
        node.updateNode(cur.getData(), cur.getNext());
        return true;
    }

    @Override
    public boolean readNext(Node node) {
        if (cur.isNextNull()) {
            return false;
        }

        cur = cur.getNext();
        node.updateNode(cur.getData(), cur.getNext());
        return true;
    }

    @Override
    public void insert(Node newNode) {
        Node pred = head;

        while (Objects.nonNull(pred.getNext()) && comparator(newNode, pred.getNext())
                == Data.NEW_DATA_BIGGER_THAN_EXIST_DATA) {
            // comparator 0의 의미는 신규 노드가 다음 노드보다 head에서 먼 경우를 뜻한다.
            pred = pred.getNext();
        }

        newNode.updateNext(pred.getNext());
        pred.updateNext(newNode);
        count++;
    }

    @Override
    public Node remove(Node node) {
        if (head.isNextNull()) {
            System.out.println("연결 리스트에 데이터가 없습니다.");
            return null;
        }

        Node search = head.getNext();
        Node predSearch = head;
        Node remove = null;

        while (Objects.nonNull(search)) {
            if (search.compareData(node) == Data.NEW_DATA_EQUALS_EXIST_DATA) {
                remove = search;

                predSearch.updateNext(search.getNext());
                break;
            }

            predSearch = search;
            search = search.getNext();
        }

        return remove;
    }

    @Override
    public int getCount() {
        return count;
    }

    private int comparator(Node newNode, Node comparedNode) {
        return newNode.compareData(comparedNode);
    }

}
