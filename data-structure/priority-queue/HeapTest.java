package priority_queue;

import org.junit.Test;

/**
 * @author yeobi Created 2020-02-22
 */
public class HeapTest {

    @Test
    public void heapTest() {
        Heap heap = Heap.init();

        heap.insert(Data.createData(3));
        heap.insert(Data.createData(2));
        heap.insert(Data.createData(1));
        heap.insert(Data.createData(1));
        heap.insert(Data.createData(2));
        heap.insert(Data.createData(3));

        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
        System.out.println(heap.remove());
    }

}
