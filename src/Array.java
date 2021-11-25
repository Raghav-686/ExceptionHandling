import java.util.InputMismatchException;
import java.util.Scanner;

public class Array
{
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of element");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the index");
            int index = sc.nextInt();
            System.out.println("The Array at Index " + index + " = " + arr[index] + " The array is accessed");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(InputMismatchException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("bye");
        }
    }
}
