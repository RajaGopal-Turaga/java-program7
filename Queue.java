package sorting;

public class Queue {
		int[] queue;
		int front,rear,capacity,count;
		Queue(int size)
		{
			capacity=size;
			queue=new int[capacity];
			front=0;
			rear=-1;
			count=0;
		}
		void enqueue(int item)
		{
			if(isFull())
			 {
	            System.out.println("Queue is full. Cannot enqueue " + item);
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queue[rear] = item;
	        count++;
	        System.out.println("Enqueued: " + item);
	    }	
	    int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }        
	        int item = queue[front];
	        front = (front + 1) % capacity;
	        count--;
	        System.out.println("Dequeued: " + item);
	        return item;
	    }
	    boolean isEmpty() {
	        return (count == 0);
	    }
	    boolean isFull() {
	        return (count == capacity);
	    }
	    int size() {
	        return count;
	    }
	    int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return -1;
	        }
	        return queue[front];
	    }
	    void display() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Current queue: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(queue[(front + i) % capacity] + " ");
	        }
	        System.out.println();
	    } 
	    public static void main(String[] args) {
	        Queue myQueue = new Queue(5);      
	        myQueue.enqueue(10);
	        myQueue.enqueue(20);
	        myQueue.enqueue(30);
	        myQueue.display();       
	        myQueue.dequeue();
	        myQueue.display(); 
	        myQueue.enqueue(40);
	        myQueue.enqueue(50);
	        myQueue.enqueue(60); 
	        myQueue.display(); 
	        System.out.println("Front element is: " + myQueue.peek()); 
	    }
	}



