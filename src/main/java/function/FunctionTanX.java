package function;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

import static java.lang.Math.PI;

public class FunctionTanX {

    Number number;

    public BigInteger calculateFactorial(int n) {
        BigInteger result = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public Number calculate(double x) {
        if ((x % (PI/2) == 0 || x % ((3*PI)/2) == 0) && x!=0) return new Number(null, true);
        return new Number(calculateSin(x).divide(calculateCos(x), 10000, RoundingMode.HALF_UP), false);
    }




    /*  Необычное представение функции
       oo
       ---
       \     (-1)^n * x^(2n+1)
       /    ------------------
       ---      (2*n+1)!
       i=0

     */
    public BigDecimal calculateSin(double x) {
        BigDecimal sin = new BigDecimal(0);
        for (int n = 0; n < 900; n++) {
            sin = sin.add(new BigDecimal(-1).pow(n).multiply(new BigDecimal(x).pow(2 * n + 1)).divide(new BigDecimal(calculateFactorial(2 * n + 1)), 10000, RoundingMode.HALF_UP));
        }
        return sin;
    }


        /*  Необычное представение функции
       oo
       ---
       \     (-1)^n * x^(2n)
       /    ------------------
       ---      (2*n)!
       i=0

     */
    public BigDecimal calculateCos(double x) {
        BigDecimal cos = new BigDecimal(0);
        for (int n = 0; n < 900; n++) {
            cos = cos.add(new BigDecimal(-1).pow(n).multiply(new BigDecimal(x).pow(2 * n)).divide(new BigDecimal(calculateFactorial(2 * n)), 10000, RoundingMode.HALF_UP));
        }
        return cos;
    }

}
