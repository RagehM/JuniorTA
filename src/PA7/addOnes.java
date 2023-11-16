package PA7;
public class addOnes {
    private static void add_a_one(LinkList l){
        LinkList tmp = new LinkList();
        while(!l.isEmpty()){
            tmp.insertLast((int) l.removeFirst() + 1);
        }
        while(!tmp.isEmpty()){
            l.insertLast((tmp.removeFirst()));
        }
    }
    public static void main (String[]args){
        LinkList l = new LinkList();
        l.insertLast(0);
        l.insertLast(1);
        l.insertLast(2);
        l.insertLast(3);
        l.insertLast(4);
        l.insertLast(5);
        l.insertLast(6);
        l.insertLast(7);
        l.insertLast(8);

        System.out.println(l.toString());

        add_a_one(l);

        System.out.println(l.toString());


    }

}
