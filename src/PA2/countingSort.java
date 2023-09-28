package PA2;

import java.util.Arrays;

public class countingSort {
    private static int get_max_number(int [] array){
        int max = array[0];
        for(int i = 1 ; i< array.length ; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    private static int[] booleanSort(int [] array){
        int max = get_max_number(array);
        boolean [] flag = new boolean[max+1];
        for(int i = 0 ; i < array.length ; i++){
            flag[array[i]] = true;
        }
        int [] sorted = new int [array.length];
        int j = 0;
        for(int i = 0 ; i < flag.length ; i++){
            if(flag[i] == true){
                sorted[j] = i;
                j++;
            }
        }
        return sorted;
    }
    public static void main(String[] args){
        int [] array = {4,2,3,1};
        array = booleanSort(array);
        System.out.println(Arrays.toString(array));
    }


}
