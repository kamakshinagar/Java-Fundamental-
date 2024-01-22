package firstPractices;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Example {

    public static void main(String[] args) throws Exception{
        out.println("Hello World!");

        // read from commnad prompt
        out.println("please enter some text.., to exit type quit");
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine())
        {
            String line = input.nextLine();
            if (Objects.equals(line, "quit"))
            {
                break;
            }
            System.out.println("I read = "+line);
            int len = line.length();
            int randonindex = new Random().nextInt(len);
            out.println("the random index is "+ randonindex);
            StringBuilder newline = new StringBuilder(line);
            newline.deleteCharAt(randonindex);

            line = line.substring(0,randonindex)+line.substring(randonindex+1);
            out.println("the new line is "+ line);

            char randomchar = ' ';
            for (int i=0;i<=line.length();i++) {
                //if i==randonindex
                 randomchar = line.charAt(randonindex-1);
            }
            out.println("the random char is = " + randomchar);
            out.println("the new line is "+ newline);



        }
    }
}
