import java.util.Scanner;
public class IsEven
{
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num % 2 == 0)
            {
                System.out.println("EVEN");
            }
            else
            {
                System.out.println("ODD");
            }
        }
       
    }
}
