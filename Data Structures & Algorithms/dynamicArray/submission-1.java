class DynamicArray {
    int[] array;
    int capacity;
    int size;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }

    public int get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return array[i];
    }

    public void set(int i, int n) {
        if (i < 0 || i >= size)
            throw new IndexOutOfBoundsException();
        array[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        array[size] = n;
        size++;

    }

    public int popback() {
        if (size == 0)
            throw new IndexOutOfBoundsException();
        int val = array[size - 1];
        size--;
        return val;
    }

    private void resize() {
        capacity = capacity * 2;
        int[] newArray = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
