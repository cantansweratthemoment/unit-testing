import function.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (double i = 0; i <= 1; i+=0.1)
            System.out.println(i + " : " + calculator.calculate(i));
    }
}
