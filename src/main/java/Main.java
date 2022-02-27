import function.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        for (int i = -100; i <= 100; i++)
            System.out.println(i + " : " + calculator.calculateSin(i));
    }
}
