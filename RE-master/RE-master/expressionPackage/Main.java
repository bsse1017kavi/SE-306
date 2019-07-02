package expressionPackage;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String [] args)
    {
        String namePattern = "[A-Z][a-z]+ [A-Z][a-z]+";
        String phonePattern = "01[3-9][0-9]{8}";
        String emailPattern = ".+@.+[.].+";
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Pattern p1 = Pattern.compile(namePattern);
        Pattern p2 = Pattern.compile(phonePattern);
        Pattern p3 = Pattern.compile(emailPattern);
        //Matcher m1 = p1.matcher(line);
        //Matcher m2 = p2.matcher(line);
        Matcher m3 = p3.matcher(line);
        if(m3.find())
        {
            System.out.println("OK");
        }

        else System.out.println("Not OK");
    }
}
