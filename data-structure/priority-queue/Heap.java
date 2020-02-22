package priority_queue;

/**
 * @author yeobi Created 2020-02-22
 * @description 배열 기반의 힙
 */
public class Heap {

    private final int HEAP_SIZE = 100;  // 힙 크기
    private Node[] heap;
    private int numOfData;

    private Heap() {
        heap = new Node[HEAP_SIZE];
    }

    // 초기화
    public static Heap init() {
        return new Heap();
    }

    public Node[] getHeap() {
        return heap;
    }

    public boolean isEmpty() {
        if (numOfData == 0) {
            return true;
        }

        return false;
    }

    // 삽입
    public void insert(Data data) {
        int newNodeIdx = numOfData + 1;

        while (newNodeIdx != 1) {
            if (this.comparePriority(heap[this.getParentIdx(newNodeIdx)].getData(), data) > 0) {
                // 신규 노드 우선순위 높은 경우
                heap[newNodeIdx] = heap[this.getParentIdx(newNodeIdx)];
                newNodeIdx = this.getParentIdx(newNodeIdx);
            } else {
                // 신규 노드 우선순위 낮은 경우
                break;
            }
        }

        heap[newNodeIdx] = Node.createNode(data);
        numOfData++;
    }

    // 삭제
    public Node remove() {
        Node removeNode = heap[1];
        Node lastEl = heap[numOfData];  // 마지막 노드

        int parentIdx = 1;    // 이동하는 마지막 노드
        int childIdx;

        while (true) {
            childIdx = searchHighestPriorityChild(parentIdx);
            if (childIdx == 0) {
                // 자식 노드 없는 경우
                break;
            }

            if (comparePriority(
                    lastEl.getData(), heap[childIdx].getData()
            ) <= 0) {
                // 마지막 노드의 우선순위가 더 높으면 반복 종료
                break;
            }

            heap[parentIdx] = heap[childIdx];
            parentIdx = childIdx;
        }

        heap[parentIdx] = lastEl;
        numOfData--;
        return removeNode;
    }

    // 우선순위 비교
    public int comparePriority(Data parentData, Data newData) {
        // 신규 노드가 크면 양수 (우선순위 낮다)
        // 신규 노드가 같거나 작으면 0 또는 음수 (우선순위 높다)
        return parentData.getValue() - newData.getValue();
    }

    // 우선순위 큰 자식 노드 검색
    private int searchHighestPriorityChild(int idx) {
        if (getLeftChildIdx(idx) > numOfData) {
            // 왼쪽 노드 없는 경우
            return 0;
        } else if (getLeftChildIdx(idx) == numOfData) {
            // 자식 노드가 왼쪽 자식 노드 하나만 있는 경우
            return getLeftChildIdx(idx);
        }

        // 자식 노드 둘 다 존재하는 경우
        if (this.comparePriority(
                heap[this.getLeftChildIdx(idx)].getData()
                , heap[this.getRightChildIdx(idx)].getData()
        ) <= 0
        ) {
            // 왼쪽 노드 우선순위 높은 경우
            return this.getLeftChildIdx(idx);
        } else {
            // 오른쪽 노드 우선순위 높은 경우
            return this.getRightChildIdx(idx);
        }
    }

    // 부모 노드 인덱스
    private int getParentIdx(int childIdx) {
        return childIdx / 2;
    }

    // 왼쪽 자식 노드 인덱스
    private int getLeftChildIdx(int parentIdx) {
        return parentIdx * 2;
    }

    // 오른쪽 자식 노드 인덱스
    private int getRightChildIdx(int parentIdx) {
        return parentIdx * 2 + 1;
    }

}
