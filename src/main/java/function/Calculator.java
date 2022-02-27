package function;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.pow;

public class Calculator {


    public int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public double calculate(double x) {
        double scale = Math.pow(10, 3);
        double calculateSin = Math.ceil(calculateSin(x) * scale) / scale;
        double calculateCos = Math.ceil(calculateCos(x) * scale) / scale;
        return calculateSin/calculateCos;
    }


    public double calculateSin(double x) {
        double r = 0;
        for (int n = 1; n < 1000; n++) {
            r += Math.pow(-1, n+1) * (Math.pow(x, 2 * n - 1) / calculateFactorial(2 * n - 1));
        }
        return r;
    }

    public double calculateCos(double x) {
        double answer = 0;
        for (int n = 0; n < 10; n++) {
            answer += Math.pow(-1, n) * (Math.pow(x, 2 * n) / calculateFactorial(2 * n));
        }
        return answer;
    }

}
