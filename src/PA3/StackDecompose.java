package PA3;
public class StackDecompose {
    private static ArrayStack decompose(ArrayStack array ){
            ArrayStack even = new ArrayStack(array.size()/2);
            ArrayStack odd = new ArrayStack(array.size()/2+1);
            ArrayStack y = new ArrayStack(array.size()/2);
            while(!array.isEmpty()){
                odd.push(array.pop());
                if(!array.isEmpty()){
                    even.push(array.pop());
                }
            }
            while(!even.isEmpty()){
                y.push(even.pop());
            }
            while(!odd.isEmpty()){
                array.push(odd.pop());
            }
            return y;
    }
    public static void main(String []args){
        ArrayStack array = new ArrayStack(8);
        array.push(6);
        array.push(9);
        array.push(3);
        array.push(5);
        array.push(4);
        array.push(1);
        array.push(2);
        array.push(7);

        array.printStack();

        ArrayStack a = decompose(array);

        a.printStack();

        array.printStack();

    }

}
