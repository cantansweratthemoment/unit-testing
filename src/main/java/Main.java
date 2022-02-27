import function.FunctionTanX;

public class Main {
    public static void main(String[] args) {
        FunctionTanX calculator = new FunctionTanX();
        for (int i = 1; i <= 20; i++)
            System.out.println(i + " : " + calculator.calculate(i).floatValue());
    }
}
