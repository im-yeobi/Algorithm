package priority_queue;

/**
 * @author yeobi Created 2020-02-22
 * @description 힙을 이용한 우선순위 큐
 */
public class PriorityQueue {

    Heap heap;

    private PriorityQueue() {
        heap = Heap.init();
    }

    public static PriorityQueue init() {
        return new PriorityQueue();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public void enqueue(Data data) {
        heap.insert(data);
    }

    public Node dequeue() {
        return heap.remove();
    }

}
