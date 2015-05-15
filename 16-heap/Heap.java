public class Heap {
    int[] heap;
    int x;

    public Heap(int[] arr) {
        heap = arr;
        x = arr.length;
        pushDown(0);
    }

    public Heap(int size) {
        heap = new int[size];
        x = size;
    }

    public boolean treeEnd(int index) {
        return 2 * index > x;
    }

    public void pushDown(int index) {
        if (treeEnd(index)) {
            return;
        }

        if (heap[2 * index] < heap[index]) {
            int tmp = heap[2 * index];
            heap[2 * index] = heap[index];
            heap[index] = tmp;
        }
        else if (heap[2 * index + 1] < heap[index]) {
            int tmp = heap[2 * index + 1];
            heap[2 * index + 1] = heap[index];
            heap[index] = tmp;
        }

        pushDown(2 * index);
        pushDown(2 * index + 1);
    }

    public int removeMin() {
        int tmp = heap[x - 1];
        heap[x - 1] = heap[0];
        heap[0] = tmp;
        x--;
        pushDown(0);
        return heap[x];
    }

    public int[] heapSort() {
        while (x > 0) {
            removeMin();
        }
        return heap;
    }
}
