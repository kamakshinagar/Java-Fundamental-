package org.example;

import java.awt.desktop.SystemEventListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int myfunction(int a, int b)
    {
        int result;
        result= a+b;
        return result;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        int x=5;
        String myname = "Java";
        boolean toggle = false;

        /*for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
        System.out.println("this is " + x+myname+toggle);
        double d = Math.random();
        if (d>0.6)
        {
            System.out.println("its bigger "+d);
        }
        else if(d>0.25){
            System.out.println("its smaller but not tiny "+ d );
        }
        else{
            System.out.println("tiny!!!");
        }

       int sum = myfunction(5,6);
        System.out.println("the sum of two numbers = "+ sum);

    }
}