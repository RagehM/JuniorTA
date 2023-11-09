package PA6;
public class Patient implements Comparable {
    String name;
    int degree_of_severity;
    public Patient(String name , int degree_of_severity){
        this.name=name;
        this.degree_of_severity=degree_of_severity;
    }
    public int compareTo(Object u){
        Patient pa = (Patient)u;
        if(pa.degree_of_severity<this.degree_of_severity){
            return 1;
        }
        else {
            return 0;
        }
    }
}
