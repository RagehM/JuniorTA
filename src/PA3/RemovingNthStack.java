package PA3;

public class RemovingNthStack {
    private static void removeNth (ArrayStack array , int n ){
        ArrayStack temp = new ArrayStack(array.size());
        n--;
        while(n != 0){
            temp.push(array.pop());
            n--;
        }
        array.pop();
        while(!temp.isEmpty()){
            array.push(temp.pop());
        }
    }
    public static void main (String []args){
        ArrayStack array= new ArrayStack(5);
        array.push(1);
        array.push(5);
        array.push(23);
        array.push(8);
        array.push(2);

        array.printStack();

        removeNth(array,3);

        array.printStack();

    }


}
