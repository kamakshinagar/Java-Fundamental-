package firstPractices;

public class NestedClasses {

    private int x;
    class nestclass{
        private int y;
       // NestedClasses n = new NestedClasses();
        //n.x = 90;


    }

    public static void main(String[] args) {
        NestedClasses n = new NestedClasses();
        n.x = 23;
        System.out.println(n.x);
       // nestclass nsmall = new nestclass();
       // nsmall.y=22;


    }
}
