package firstPractices;

import static java.lang.System.out;

public class stringComparisions {

    public static void main(String[] args) throws Exception{
        String one = "Hello";
        String two = " World";
        String three = "Hello World";

        String four = one+two;
        boolean b1 = (three == four);
        boolean b2 = three.equals(four);
        out.printf("b1= %B and b2=%B\n", b1, b2);

        StringBuilder builder = new StringBuilder("helloWorld");
        StringBuilder builder2 = new StringBuilder("helloWorld");
        out.println("builder = "+builder);
        out.println("builder.equals(\"helloWorld\")= "+ builder.equals("helloWorld"));
        out.println("\"helloworld\".equals(builder.toString()) = "+"helloworld".equals(builder.toString()));
        out.println("builder.equals(builder2)= "+builder.equals(builder2));
        out.println("builder==builder "+ (builder==builder2));
        out.println("builder==helloWorld "+ (builder.toString().equals("helloWorld")));
    }
}
