package PA6;
public class EmergencyRoom {
    PriorityQueue q;
    public EmergencyRoom(int max){
        q = new PriorityQueue(max);
    }
    public void newPatient(String n , int p){
        if(!q.isFull()){
            q.insert(new Patient(n,p));
        }
        else{
            System.out.println("Eme is Full!!");
        }
    }
    public Patient nextPatient()
    {
        if (!q.isEmpty())
            return ((Patient)q.remove());
        else
            return null;
    }
    public static void main (String[] args)
    {
        EmergencyRoom r = new EmergencyRoom(5);
        r.newPatient("John",3);
        r.newPatient("Erick",5);
        r.newPatient("Jessica",1);
        r.newPatient("Michael",2);
        r.newPatient("Mona",4);
        for (Patient p=r.nextPatient(); p!=null; p=r.nextPatient())
            System.out.println(p.name);
    }

}
