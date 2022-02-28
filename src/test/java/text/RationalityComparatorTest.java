package text;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RationalityComparatorTest {
    @Test
    public void compareFromPersonPointOfView() {
        RationalityComparator rationalityComparator = new RationalityComparator(BiologicalThinkerClass.PERSON);
        Thinker thinker1 = new Thinker("Ali", BiologicalThinkerClass.DELPHIN);
        Thinker thinker2 = new Thinker("Olya", BiologicalThinkerClass.PERSON);
        assertEquals(rationalityComparator.compare(thinker1, thinker2), -1);
        assertEquals(rationalityComparator.compare(thinker2, thinker1), 1);
    }

    @Test
    public void compareFromDelphinPointOfView() {
        RationalityComparator rationalityComparator = new RationalityComparator(BiologicalThinkerClass.DELPHIN);
        Thinker thinker1 = new Thinker("Ali", BiologicalThinkerClass.DELPHIN);
        Thinker thinker2 = new Thinker("Olya", BiologicalThinkerClass.PERSON);
        assertEquals(rationalityComparator.compare(thinker1, thinker2), 1);
        assertEquals(rationalityComparator.compare(thinker2, thinker1), -1);
    }

    @Test
    public void compareEqualityFromPersonPointOfView() {
        RationalityComparator rationalityComparator = new RationalityComparator(BiologicalThinkerClass.PERSON);
        Thinker thinker1 = new Thinker("Ali", BiologicalThinkerClass.PERSON);
        Thinker thinker2 = new Thinker("Olya", BiologicalThinkerClass.PERSON);
        Thinker thinker3 = new Thinker("Sasha", BiologicalThinkerClass.DELPHIN);
        Thinker thinker4 = new Thinker("Grisha", BiologicalThinkerClass.DELPHIN);
        assertEquals(rationalityComparator.compare(thinker1, thinker2), 0);
        assertEquals(rationalityComparator.compare(thinker3, thinker4), 0);
    }

    @Test
    public void compareEqualityFromDelphinPointOfView() {
        RationalityComparator rationalityComparator = new RationalityComparator(BiologicalThinkerClass.DELPHIN);
        Thinker thinker1 = new Thinker("Ali", BiologicalThinkerClass.PERSON);
        Thinker thinker2 = new Thinker("Olya", BiologicalThinkerClass.PERSON);
        Thinker thinker3 = new Thinker("Sasha", BiologicalThinkerClass.DELPHIN);
        Thinker thinker4 = new Thinker("Grisha", BiologicalThinkerClass.DELPHIN);
        assertEquals(rationalityComparator.compare(thinker1, thinker2), 0);
        assertEquals(rationalityComparator.compare(thinker3, thinker4), 0);
    }
}
