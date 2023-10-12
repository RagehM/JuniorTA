package PA4;
public class ValidPrefix {
    private static boolean isValid(String prefix){
        int counter = 0;
        for(int i = prefix.length()-1 ; i>=0 ; i-- ){
            if(prefix.charAt(i)=='*' || prefix.charAt(i)=='+' || prefix.charAt(i)=='-' || prefix.charAt(i)=='/'){
                if(counter<2){
                    return false;
                }
                else{
                    counter--;
                }
            }
            else{
                counter++;
            }
        }
        return counter == 1;
    }
    public static void main(String[]args){
        String s = "*3-5+43";
        System.out.println(isValid(s));
    }

}
