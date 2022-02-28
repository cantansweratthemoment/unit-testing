package function;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FunctionTester {
    FunctionTanX functionTanX = new FunctionTanX();


    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    @DisplayName("Test function in [0 ... 9] values")
    void intAssertion(int values) {
        assertEquals(functionTanX.calculate(values).getNumber(), Math.tan(values), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9})
    @DisplayName("Test function in [0.1 ... 0.9] values")
    void doubleAssertion(double values) {
        assertEquals(functionTanX.calculate(values).getNumber(), Math.tan(values), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {(PI / 2), (3 * PI) / 2, (PI / 2) + 2 * PI, ((3 * PI) / 2) + (2 * PI)})
    @DisplayName("Test function in [ PI/2, 3*PI/2, PI/2 + 2PI, 3PI/2 + 2PI ] on NaN")
    void nanAssertion(double nanNumbers) {
        assertTrue(functionTanX.calculate(nanNumbers).isNan());
    }
}
