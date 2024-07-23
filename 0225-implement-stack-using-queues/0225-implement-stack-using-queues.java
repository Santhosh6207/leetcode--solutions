class MyStack {
    private Queue<Integer> qe;

    public MyStack() {
        qe = new LinkedList<>();
    }

    public void push(int x) {
        // Add the new element
        qe.add(x);
        // Rotate the queue to make the new element as the front
        for (int i = 0; i < qe.size() - 1; i++) {
            qe.add(qe.remove());
        }
    }

    public int pop() {
        // Remove and return the front element of the queue
        return qe.remove();
    }

    public int top() {
        // Peek at the front element of the queue
        return qe.peek();
    }

    public boolean empty() {
        // Return true if the queue is empty, false otherwise
        return qe.isEmpty();
    }
}