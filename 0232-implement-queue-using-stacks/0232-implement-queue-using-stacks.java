class MyQueue {
Stack<Integer>st;
Stack<Integer>st1;
int front;
    public MyQueue() {
        this.st=new Stack<>();
       this.st1=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty())
          front=x;
       st.push(x);
        
    }
    
    public int pop() {
        if(st1.isEmpty())
        {
        while(!st.isEmpty())
        {
            st1.push(st.pop());
        }
        }
        return st1.pop();
    }
    
    public int peek() {
       return st1.isEmpty()?front:st1.peek(); 
    }
    
    public boolean empty() {
        return st1.isEmpty()&&st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */