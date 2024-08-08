import java.util.Scanner;
public class AdditionProgram
{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number:");
        int s=scanner.nextInt();
        System.out.println("Enter the Second number:");
        int m=scanner.nextInt();
        int sum=s+m;
        System.out.print(sum);
    }
}

