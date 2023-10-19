package PA5;

public class ShiftZeros {
    private static void shiftZeros(QueueObj input){
        QueueObj zeros = new QueueObj(input.size());
        QueueObj temp = new QueueObj(input.size());
        while(!input.isEmpty()){
            if((Integer)input.peek()==0){
                zeros.enqueue(input.dequeue());
            }
            else{
                temp.enqueue(input.dequeue());
            }
        }
        while(!temp.isEmpty()){
            input.enqueue(temp.dequeue());
        }
        while(!zeros.isEmpty()) {
            input.enqueue(zeros.dequeue());
        }
    }
    public static void main(String []args){
        QueueObj q = new QueueObj(10);
        q.enqueue(5);
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(0);
        q.enqueue(0);
        q.enqueue(6);
        q.enqueue(1);
        q.enqueue(0);

        q.printQueue();

        shiftZeros(q);

        q.printQueue();
    }
}
