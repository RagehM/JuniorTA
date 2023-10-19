package PA5;
public class insertElementsAtFront {
    private static void insertAtFront(QueueObj q1,QueueObj q2){
        QueueObj temp = new QueueObj(q1.size());
        while(!q1.isEmpty()){
            temp.enqueue(q1.dequeue());
        }
        temp.printQueue();
        while(!q2.isEmpty() && !q1.isFull()){
            q1.enqueue(q2.dequeue());
        }
        q1.printQueue();
        while(!q1.isFull()){
            q1.enqueue(temp.dequeue());
        }
    }
    public static void main(String []args){
        QueueObj q1 = new QueueObj(7);
        q1.enqueue(5);
        q1.enqueue(12);
        q1.enqueue(6);
        q1.enqueue(3);
        q1.enqueue(9);
        q1.enqueue(0);
        q1.enqueue(-2);

        QueueObj q2 = new QueueObj(3);
        q2.enqueue(4);
        q2.enqueue(-3);
        q2.enqueue(2);

        q1.printQueue();
        q2.printQueue();

        insertAtFront(q1,q2);

        q1.printQueue();


//        QueueObj q1 = new QueueObj(3);
//        q1.enqueue(2);
//        q1.enqueue(6);
//        q1.enqueue(1);
//
//        QueueObj q2 = new QueueObj(4);
//        q2.enqueue(17);
//        q2.enqueue(19);
//        q2.enqueue(37);
//        q2.enqueue(41);
//
//        q1.printQueue();
//        q2.printQueue();
//
//        insertAtFront(q1,q2);
//
//        q1.printQueue();
    }
}
