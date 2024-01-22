package firstPractices;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class tempConverter {

    public static double fToc(double c)
    {
        return 5*(c-32)/9;
    }
    public static void main(String[] args) throws Exception{
        out.println("Hello World!");

        // read from command prompt
        out.println("please enter a number.., to exit type quit");
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String line = input.nextLine();
            if (Objects.equals(line, "quit")) {
                break;
            }
            System.out.println("I read = " + line);
            double d = Double.parseDouble(line);
            out.println("the converted temp in centigrade "+ fToc(d));


        }
    }
}
