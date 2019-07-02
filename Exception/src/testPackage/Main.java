package testPackage;

public class Main
{
    public static void main(String [] args)
    {
        try {
            Circle circle = new Circle(0);
        }catch (ArithmeticException e)
        {
            System.out.println("Wrong radius.");
        }
    }
}
