public class t 
{
    public static void main(String[] args)
    {
    int n = args.length;
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        try 
        {
            int num = Integer.parseInt(args[i]);
            if (num < 0)
            {
                throw new Exception("Negative number not allowed");
            } 
            else if (num % 10 == 0)
             {
                throw new Exception("Number divisible by 10 not allowed");
            }
            else if (num > 1000 && num < 2000)
            {
                throw new Exception("Number between 1000 and 2000 not allowed");
            } 
            else if (num > 7000) 
            {
                throw new Exception("Number greater than 7000 not allowed");
            }
            sum += num;
        } 
        catch (Exception e) 
        {
            System.out.println("Skipping number " + args[i] + " due to error: " + e.getMessage());
        }
    }
    System.out.println("Sum of valid numbers: " + sum);
    }
}