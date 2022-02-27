package function;

public class Calculator {


    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public double calculate(double x) {
        return calculateSin(x) / calculateCos(x);
    }


    public double calculateSin(double x) {
        if (x > 1 || x < -1) {
            return Double.NaN;
        }
        double r = 0;
        for (int n = 0; n < 16; n++) {
            r += (Math.pow(-1, n) * (Math.pow(x, 2 * n + 1)) / calculateFactorial(2 * n + 1));
        }
        return r;
    }

    public double calculateCos(double x) {
        if (x > 1 || x < -1) {
            return Double.NaN;
        }
        double answer = 0;
        for (int n = 0; n < 16; n++) {
            answer += (Math.pow(-1, n) * Math.pow(x, 2 * n)) / calculateFactorial(2 * n);
        }
        return answer;
    }

}
