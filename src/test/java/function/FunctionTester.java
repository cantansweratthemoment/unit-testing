package function;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.PI;
import static java.lang.Math.tan;
import static org.junit.jupiter.api.Assertions.*;

public class FunctionTester {
    FunctionTanX functionTanX = new FunctionTanX();


    @ParameterizedTest
    @ValueSource(floats = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    @DisplayName("Test function in [0 ... 9] values")
    void intAssertion(float values) {

        assertEquals(functionTanX.calculate(values).getNumber(), Math.tan(values), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1})
    @DisplayName("Test function in [0.1 ... 0.9] values")
    void doubleAssertion(double values) {
        assertEquals(functionTanX.calculate(values).getNumber(), Math.tan(values), 0.0001);
    }

    @ParameterizedTest
    @ValueSource(doubles = {PI / 2, (3 * PI) / 2})
    @DisplayName("Test function in [ PI/2, 3*PI/2 ] on NaN")
    void nanAssertion(double nanNumbers) {
        assertTrue(functionTanX.calculate(nanNumbers).isNan());
    }
}
