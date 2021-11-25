import java.util.InputMismatchException;
import java.util.Scanner;

public class Age
{
    static class AgeException extends Exception
    {
        AgeException(){
            super();
            System.out.println("Age Exception");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = null;
        int age = 0;
        try {
            name = sc.nextLine();
            age = sc.nextInt();
            if(age < 0 || age > 60){
                throw new AgeException();
            }
            System.out.println("Age: "+ age + "name:" + name);
        }catch (InputMismatchException | AgeException g){
            System.out.println(g);
        }

    }
}
