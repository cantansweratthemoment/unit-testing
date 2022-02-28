package text;

import java.util.Comparator;

public class RationalityComparator implements Comparator<Thinker> {
    private BiologicalThinkerClass pointOfView;

    public RationalityComparator(BiologicalThinkerClass pointOfView) {
        this.pointOfView = pointOfView;
    }

    public BiologicalThinkerClass getPointOfView() {
        return pointOfView;
    }

    public void setPointOfView(BiologicalThinkerClass pointOfView) {
        this.pointOfView = pointOfView;
    }

    @Override
    public int compare(Thinker o1, Thinker o2) {
        if (o1.biologicalThinkerClass == o2.biologicalThinkerClass) {
            return 0;
        }
        if (o1.biologicalThinkerClass == BiologicalThinkerClass.PERSON) {
            if (this.pointOfView == BiologicalThinkerClass.PERSON) {
                return 1;
            }
            return -1;
        } else {
            if (this.pointOfView == BiologicalThinkerClass.PERSON) {
                return -1;
            }
            return 1;
        }
    }
}
