import java.util.InputMismatchException;

public class MathOperation
{
    public static void main(String[] args) {
        try
        {
        int n = args.length;
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(args[i]);
            sum=sum+arr[i];
        }
            System.out.println("the sum of array is  "+sum);
            System.out.println("average of array is  "+sum/n);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Bye");
        }
    }
}
