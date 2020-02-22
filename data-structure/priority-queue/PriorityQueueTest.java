package priority_queue;

import org.junit.Test;

/**
 * @author yeobi Created 2020-02-22
 */
public class PriorityQueueTest {

    @Test
    public void priorityQueueTest() {
        PriorityQueue priorityQueue = PriorityQueue.init();

        if (priorityQueue.isEmpty()) {
            System.out.println("우선순위 큐가 비어있습니다.");
        }

        priorityQueue.enqueue(Data.createData(10));
        priorityQueue.enqueue(Data.createData(4));
        priorityQueue.enqueue(Data.createData(6));
        priorityQueue.enqueue(Data.createData(2));
        priorityQueue.enqueue(Data.createData(5));

        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
        System.out.println(priorityQueue.dequeue());
    }

}
