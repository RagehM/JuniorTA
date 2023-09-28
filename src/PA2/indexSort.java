package PA2;

import java.util.Arrays;

public class indexSort {
    private static int[] indexSort(int[] array){
        int [] sorted_array = new int[array.length];
        for(int i = 0 ; i<array.length ; i++){
            int index = 0;
            for(int j = 0 ; j<array.length ; j++){
                if(array[i] > array[j] || ( (array[i] == array[j]) && (i < j) )){
                    index++;
                }
            }
            sorted_array[index]=array[i];
        }
        return sorted_array;
    }
//    private static void displayArray(int[]array){
//        for(int i = 0 ; i<array.length ; i++){
//            System.out.print(array[i]+" ");
//        }
//    }
    public static void main(String[] args){
        int [] array = {9,8,7,3,2,5,1,2,4,3,0};
        array = indexSort(array);
        System.out.println(Arrays.toString(array));


    }
}
