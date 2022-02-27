package function;

import java.math.BigDecimal;

public class Number {
    BigDecimal number;
    boolean isNan;

    Number(BigDecimal number, boolean isNan) {
        this.number = number;
        this.isNan = isNan;
    }

    public float getNumber() {
        return number.floatValue();
    }

    public boolean isNan(){
        return isNan;
    }
}
