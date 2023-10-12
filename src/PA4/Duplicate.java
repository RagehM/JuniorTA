package PA4;
public class Duplicate {
    private static StackObj createDuplicates(StackObj stack ,ArrayStack count){
        ArrayStack temp = new ArrayStack(count.size());
        int s = 0;
        while(!count.isEmpty()){
            temp.push(count.top());
            s+=count.pop();
        }
        while(!temp.isEmpty()){
            count.push(temp.pop());
        }
        StackObj result = new StackObj(s);
        while(!stack.isEmpty()){
            int c = count.pop();
            while(c!=0){
                result.push(stack.top());
                c--;
            }
            stack.pop();
        }
        return result;
    }
    public static void main(String[]args){
        ArrayStack s = new ArrayStack (3);
        s.push(2);
        s.push(3);
        s.push(1);
        StackObj a = new StackObj (3);
        a.push("Slim");
        a.push("Abdellatif");
        a.push("Hend");
        StackObj r = createDuplicates(a,s);
        r.printStack();
    }
}
