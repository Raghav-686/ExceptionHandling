import java.util.InputMismatchException;
import java.util.Scanner;

public class   UserDefinedException
{
    static class NegativeValues extends Exception
    {
        public String toString()
        {
            return "NegativeException";
        }

    }
    static class OutofRange extends Exception
    {
        public String toString()
        {
            return "OutofRangeException";
        }

    }
    static public void avgMarks(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int marks[] = new int[3];
            String name;
            try{
                System.out.print("Enter the name of Student ");
                name = sc.nextLine();
                System.out.print("Enter the Marks of 3 Subject ");
                for (int j = 0; j < 3; j++) {
                    marks[j] = sc.nextInt();
                    if(marks[j] < 0){
                        throw new NegativeValues();
                    }
                    if(marks[j] > 100 ){
                        throw new OutofRange();
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println(e);
            }
            catch(NegativeValues e)
            {
                System.out.println(e);
            }
            catch (OutofRange e)
            {
                System.out.println(e);
            }
            int s = 0;
            for (int j = 0; j < 3; j++) {
                s = s+marks[j];
            }
            System.out.println("Average Marks "+ s/3);
            sc.nextLine();
        }
    }
public static void main(String[]args)
{
    avgMarks();
}

}
class AgeException extends Exception
{
    public String toString()
    {
        return "AgeException";
    }
}