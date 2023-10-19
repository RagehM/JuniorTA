package PA4;
import PA5.QueueObj;

public class Palindrome {
    private static boolean isPalindrome ( String str ) {
        StackObj firstHalf = new StackObj ( str.length () / 2);
        QueueObj secondHalf = new QueueObj ( str.length () / 2);
        int i;
        for (i = 0; i < str.length () / 2; i++) {
            firstHalf.push(new Character( str.charAt(i)));
        }
        for (i = i + str.length () % 2; i < str.length (); i++) {
            secondHalf.enqueue(new Character(str.charAt(i)));
        }
        while (! firstHalf . isEmpty ()) {
            char c1 = ((Character)firstHalf.pop()).charValue();
            char c2 = ((Character)secondHalf.dequeue()).charValue();
            if ( c1 != c2 )
                return false ;
        }
        return true ;
    }
    public static void main ( String [] args ) {
        System.out.println(isPalindrome(" radar " ));
        System.out.println(isPalindrome(" mom " ));
        System.out.println(isPalindrome(" abba " ));
        System.out.println(isPalindrome(" raddr " ));
        System.out.println(isPalindrome(" radal " ));
        System.out.println(isPalindrome(" Race ␣ car " ));
        System.out.println(isPalindrome(" Hello " ));
    }
}
