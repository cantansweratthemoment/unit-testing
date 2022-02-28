package text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactTest {
    @Test
    public void testFact() {
        Fact fact = new Fact("Истина зачастую совсем не такова, какой кажется.", Importance.HIGH, Popularity.HIGH);
        assertEquals(fact.getWording(), "Истина зачастую совсем не такова, какой кажется.");
        assertEquals(fact.getImportance(), Importance.HIGH);
        assertEquals(fact.getPopularity(), Popularity.HIGH);
    }
}
