import java.util.Scanner;
class Demo
{
    public static void (String args[])
    {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();

        }
        System.out.print(arr);
        
    }
}