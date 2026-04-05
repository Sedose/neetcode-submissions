class DynamicArray {
    private int[] arr;
    private int size;      // Number of elements in the array
    private int capacity;  // Current capacity of the underlying array

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        // Returns the element at index i (assume i is valid)
        return arr[i];
    }

    public void set(int i, int n) {
        // Sets the element at index i to n (assume i is valid)
        arr[i] = n;
    }

    public void pushback(int n) {
        // Adds n to the end of the array, resizing if necessary
        if (size == capacity) {
            resize();
        }
        arr[size] = n;
        size++;
    }

    public int popback() {
        // Removes and returns the last element (assume array is non-empty)
        int lastElement = arr[size - 1];
        size--;
        return lastElement;
    }

    private void resize() {
        // Doubles the capacity and copies elements to the new array
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int getSize() {
        // Returns the current number of elements
        return size;
    }

    public int getCapacity() {
        // Returns the current capacity
        return capacity;
    }
}
