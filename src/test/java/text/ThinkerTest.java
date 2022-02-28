package text;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ThinkerTest {
    @Test
    public void testBiologicalClassDescription() {
        Thinker thinker1 = new Thinker("Ali", BiologicalThinkerClass.DELPHIN);
        Thinker thinker2 = new Thinker("Olya", BiologicalThinkerClass.PERSON);
        assertEquals(thinker1.getBiologicalThinkerClass().getAchievement(), "Этот вид плескался в воде и развлекался.");
        assertEquals(thinker2.getBiologicalThinkerClass().getAchievement(), "Этот вид придумал колесо, Нью-йорк, войну.");
    }
}
