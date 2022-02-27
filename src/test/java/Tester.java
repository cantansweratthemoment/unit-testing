import function.FunctionTanX;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class Tester {
    FunctionTanX functionTanX = new FunctionTanX();

    @Test
    void groupAssertions() {
        double[] numbers = {1.55741};
        assertAll("numbers",
                () -> assertEquals(numbers[0], functionTanX.calculate(1).floatValue(), 0.000001)
        );
    }
}
