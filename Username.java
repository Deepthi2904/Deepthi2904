import java.util.Scanner;
class username 
{
    public static void main(String args[])
    {
        String name;
        System.out.print("Enter the User Name :- ");
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        input.close();
        System.out.println("Hello, "+name);
    }
}
