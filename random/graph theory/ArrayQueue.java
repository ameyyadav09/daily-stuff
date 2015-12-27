class ArrayQueue{
    private int array[];
    private int front;
    private int rear;
    public int size;
    public int count;
    ArrayQueue(int size) {
      this.size = size;
      array = new int[size];
      count = 0;
      front = -1;
      rear = -1;
    }
    public boolean isEmpty() {
      if(front == -1)
          return true;
      return false;
    }
    public boolean isFull() {
      if(front == 0 && rear == size - 1) {
          return true;
      }
      else
          return false;
    }
    public void insert(int value) {
      if(rear == -1) {
          front = 0;
          rear = 0;
          array[rear] = value;
          count ++;
          return;
      }
      else if(rear + 1 >= size) {
          System.out.println("queue is full");
          return;
      }
      array[++rear] = value;
      count++;
    }
    public int delete() {
      if(isEmpty()) {
          System.out.println("queue empty");
          return -1;
      }
      if(front == rear) {
          int temp = array[rear];
          front = -1;
          rear = -1;
          count --;
          return temp;
      }
      else {
        int temp = array[front];
        front ++;
        count --;
        return temp;
      }
    }
    public void print() {
      for(int i = front; i <= rear ; i ++) {
          int j = front;
      System.out.print(array[i]+",");
      j++;
      }
      System.out.println("\n");
    }
}