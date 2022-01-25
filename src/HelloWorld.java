import java.util.Scanner;

public class HelloWorld
{
    public static void main(String[] args)
    {
        //Print Hello World
        System.out.println("Hello World");
        //New Scanner object
        Scanner scanner = new Scanner(System.in);
        //Print What is your name?
        System.out.println("What is your name?");
        //Scanner stores input in name variable
        String name = scanner.nextLine();

        System.out.println("Hello " + name + " :)");
    }
}
