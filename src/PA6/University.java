package PA6;

public class University implements Comparable {
    String name;
    int rank;
    public University(String name , int rank){
        this.name=name;
        this.rank=rank;
    }
    public int compareTo(Object u){
        University inside_the_queue = (University)u;
        if(inside_the_queue.rank<this.rank){
            return 1;
        }
        else{
            return 0;
        }
    }
    public String toString()
    {
        return name+" "+rank;
    }
    public static void main(String[] args){
        PriorityQueue x = new PriorityQueue(5);
        x.insert(new University("FCIC",4));
        x.insert(new University("GUC",3));
        x.insert(new University("BUE",4));
        x.insert(new University("AUC",2));
        x.insert(new University("FCIS",1));
        while(!x.isEmpty())
            System.out.println(x.remove());
    }

}
