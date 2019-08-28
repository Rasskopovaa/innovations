package calculator.test;

import org.apache.log4j.Logger;

/**
 * Concole calculator *
 */
public class App {
    private static final Logger logger =Logger.getLogger(App.class);
    public static void main(String[] args) {

        logger.info(sum(2, 3));
        logger.info(sub(2, 3));
        logger.info(div(2, 3));
        logger.info(mult(2, 3));

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
