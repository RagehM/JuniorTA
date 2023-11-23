package PA8;
public class Queue {
    DoublyLinkedList l;
    public Queue(){
        l = new DoublyLinkedList();
    }

    public void enqueue(Object o){
        l.insertLast(o);
    }

    public Object dequeue(){
        return l.removeLast();
    }

    public Object peek(){
        return l.getLast();
    }

    public boolean isEmpty(){
        return l.isEmpty();
    }

    public int size(){
        int count = 0;
        DoublyLinkedList temp = new DoublyLinkedList();
        while(!l.isEmpty()){
            temp.insertLast(l.removeFirst());
            count++;
        }
        while(!temp.isEmpty()){
            l.insertLast(temp.removeFirst());
        }
        return count;
    }
    public void printQueue(){
        l.displayForward();
    }

    public static void main(String[]args){
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.dequeue();

        q.printQueue();
        System.out.println(q.size());
    }
}
