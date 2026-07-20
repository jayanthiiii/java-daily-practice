import java.util.*;

public class sum{
    public static void main(String[] args) {
        int n = 1234;
        int rev = 0;
        while(n!=0)
        {
            int last = n%10;
            rev = (rev * 10)+last;
            n=n/10;

        }
        System.out.println(rev); 
 
        int n = 1221;
        int rev = 0;
        int org = n;
        while(n!=0)
        {
            int last = n%10;
            rev = (rev * 10) + last;
            n=n/10;

        }
        System.out.println(rev);
        if(org == rev)
            System.out.println("palindrome");
        else
            System.out.println(" not palindrome");
        
      
    }
}