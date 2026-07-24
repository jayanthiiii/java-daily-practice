class Magic 
{
    public static void main(String[] args)
    {
        int a = 5234;
        int sum = 0;
        while(a!=0)
        {
            int last = a%10;
            sum = sum + last;
            a = a/10;
        }
        System.out.println("Sum of digits: " + sum);
        while(sum>9)
        {
            int last = sum%10;
            sum = sum/10;
            sum = sum + last;
        }
    }    
}