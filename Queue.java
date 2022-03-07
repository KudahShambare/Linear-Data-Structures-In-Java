/*

You're given an empty Queue class. Write code to support standard queue operations like enqueue, dequeue, peek, size, and isEmpty.

• void enqueue(int val): Inserts element 'val' at the rear (right side) of the queue
• int dequeue(): Removes and return the element from the front (left side) of the queue
• int peek(): Returns the element at the front of the queue without removing it
• int size(): Returns the total number of elements in the queue
• bool isEmpty(): Returns true if the queue is empty; false otherwise

For example,

Input: [enqueue(6), enqueue(5), enqueue(7), isEmpty(), size(), peek(), dequeue(), peek(), dequeue(), peek(), dequeue(), isEmpty(), size()]
Output: [null, null, null, false, 3, 7, 7, 5, 5, 6, 6, true, 0]
Explanation:

Queue s
s.enqueue(6)
s.enqueue(5)
s.enqueue(7)
s.isEmpty() -> false
s.size() -> 3
s.peek() -> 7
s.dequeue() -> 7
s.peek() -> 5
s.dequeue() -> 5
s.peek() -> 6
s.dequeue() -> 6
s.isEmpty() -> true
s.size() -> 0


Input: [isEmpty(), enqueue(6), enqueue(7), enqueue(8), enqueue(5), enqueue(3), peek(), dequeue(), enqueue(10), peek(), dequeue(), peek(), dequeue(), isEmpty(), size()]
Output: [true, null, null, null, null, null, 3, 3, null, 10, 10, 5, 5, false, 3]

Constraints:

• The dequeue and peek operations will never be called on an empty queue.
• The maximum capacity of the queue is 1000.

*/

import java.util.*;

class Queue {

    ArrayList<Integer> queue;

    Queue() {

        this.queue = new ArrayList<Integer>();
    }

    int dequeue() {
    if(queue.isEmpty()){
        return 9999;
    }else{
        int first=queue.get(0);
      int [] k= {first};
      //  int returnValue=first*1;
           queue.remove(0);
   
           return k[0];
    }

    }

    void enqueue(int val) {
        queue.add(val);

    }

    /* Return the last element in the queue */
    int peek() {
      
        if (queue.size()>=1){
           return queue.get(0);
       }else{
           return 9999;
       }
       

    }

    /* Returns The Size Of The Queue */
    int size() {
        return queue.size();

    }

    boolean isEmpty() {
        if (queue.size() == 0) {
            return true;
        } else {
            return false;
        }

    }

    // Main Method
    public static void main(String[] args) {
        Queue s = new Queue();
        s.enqueue(5);
    s.enqueue(10);
       s.dequeue();
       System.out.println("Peek: "+s.peek());
        System.out.println("removed "+s.dequeue());

    }
};
