import function.FunctionTanX;
import org.junit.jupiter.api.*;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    FunctionTanX functionTanX = new FunctionTanX();


    @Test
    void intAssertion() {
        double[] numbers = {0, 1.55741, -2.18504, -0.142547, 1.15782, -3.38052,
                            -0.291006, 0.871448, -6.79971, -0.452316};
        double[] answers = new double[10];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = functionTanX.calculate(i).getNumber();
        }
        assertArrayEquals(numbers, answers, 0.0001);
    }

    @Test
    void doubleAssertion() {
        double[] numbers = {0.100335, 0.20271, 0.309336, 0.422793, 0.546302,
                            0.684137, 0.842288, 1.02964, 1.26016, 1.55741};
        double[] answers = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1};
        for (int i = 0; i < answers.length; i++) {
            answers[i] = functionTanX.calculate(answers[i]).getNumber();
        }
        assertArrayEquals(numbers, answers, 0.0001);
    }

    @Test
    void nanAssertion(){
        double[] answers = {PI/2, 3*PI/2};
        for (double answer : answers) {
            assertTrue(functionTanX.calculate(answer).isNan());
        }
    }
}
