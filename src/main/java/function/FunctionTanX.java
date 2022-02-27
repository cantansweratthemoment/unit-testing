package function;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class FunctionTanX {


    public BigInteger calculateFactorial(int n) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public BigDecimal calculate(double x) {
        return calculateSin(x).divide(calculateCos(x), 1000, RoundingMode.DOWN);
    }


    public BigDecimal calculateSin(double x) {
        BigDecimal sin = new BigDecimal(0);
        for (int n = 0; n < 1000; n++) {
            sin = sin.add(new BigDecimal(-1).pow(n).multiply(new BigDecimal(x).pow(2 * n + 1)).divide(new BigDecimal(calculateFactorial(2 * n + 1)), 1000, RoundingMode.DOWN));
        }
        return sin;
    }

    public BigDecimal calculateCos(double x) {
        BigDecimal cos = new BigDecimal(0);
        for (int n = 0; n < 1000; n++) {
            cos = cos.add(new BigDecimal(-1).pow(n).multiply(new BigDecimal(x).pow(2 * n)).divide(new BigDecimal(calculateFactorial(2 * n)), 1000, RoundingMode.DOWN));
        }
        return cos;
    }

}
