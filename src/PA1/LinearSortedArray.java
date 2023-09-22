package PA1;
public class LinearSortedArray {
    int array[];
    int no_of_elements;
    int right;
    private LinearSortedArray(int size) {
        this.array= new int[size];
    }
    private void OrderedInsert(int x) {
        if (no_of_elements==array.length) {
            System.out.println("Array is Full!");
        }
        else{
            if(no_of_elements==0) {
                array[0]=x;
            }
            else {
                for (int i = no_of_elements - 1; i >= 0; i--) {
                    if (array[i] > x) {
                        array[i + 1] = array[i];
                        array[i] = x;
                    } else {
                        array[i + 1] = x;
                        break;
                    }
                }
            }
            no_of_elements++;
        }
    }
    private int binarySearchIter(int x){
        int low=0;
        int high=no_of_elements-1;
        int mid;
        while (low<=high){
            mid=low+(high-low)/2;
            if(array[mid]==x){
                return mid;
            }
            else{
                if(array[mid]<x){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    private int binarySearchRec(int x){
        int low=0;
        int high=no_of_elements-1;
        return help(low,high,x);
    }
    private int help(int low,int high,int x){
        int mid=low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(array[mid]==x){
            return mid;
        }
        if(array[mid]<x){
            return help(mid+1,high,x);
        }
        else{
            return help(low,mid-1,x);
        }
    }

    public void delete(int x){
        int index_of_element_to_be_deleted = this.binarySearchIter(x);
        if(index_of_element_to_be_deleted==-1)
            System.out.println("Not Found!");
        else
        {
            for(int i=index_of_element_to_be_deleted;i<no_of_elements-1;i++) {
                array[i] = array[i + 1];
            }
            no_of_elements--;
        }
    }
    private void displayArray(){
        for(int i=0;i<no_of_elements;i++){
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[]args) {
        LinearSortedArray a1 = new LinearSortedArray(5);
        a1.OrderedInsert(1);
        a1.OrderedInsert(2);
        a1.OrderedInsert(3);
        a1.OrderedInsert(4);
        a1.OrderedInsert(5);
        a1.displayArray();
        System.out.println();
//        System.out.println(a1.binarySearchIter(4));
//        System.out.println(a1.binarySearchRec(4));
//        a1.delete(2);
//        a1.displayArray();
    }


}
