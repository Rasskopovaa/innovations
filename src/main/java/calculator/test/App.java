package calculator.test;

/**
 * Concole calculator *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(sum(2, 3));
        System.out.println(sub(2, 3));
        System.out.println(div(2, 3));
        System.out.println(mult(2, 3));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

}
