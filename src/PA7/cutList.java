package PA7;

public class cutList {
    private static LinkList cut(LinkList l){
        LinkList front = new LinkList();
        LinkList back = new LinkList();
        while(!l.isEmpty())
        {
            front.insertLast(l.removeFirst());
            if(!l.isEmpty())
                back.insertFirst(l.removeLast());
        }
        while(!back.isEmpty()) {
            front.insertFirst(back.removeLast());
        }
        return front;
    }
}
