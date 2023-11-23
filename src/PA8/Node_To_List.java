package PA8;
public class Node_To_List {
    private static LinkList nodeToList(Link node){
        LinkList l = new LinkList();
        String s = node.data.toString();
        for(int i = 0 ; i < s.length() ; i++){
            l.insertLast(s.charAt(i));
        }
        return l;
    }
    public static void main(String[]args){
        Link node = new Link(147);
        LinkList l = nodeToList(node);
        System.out.println(l.toString());
    }
}
