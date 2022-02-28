package text;

public class Thinker {
    private String name;
    BiologicalThinkerClass biologicalThinkerClass;

    public Thinker(String name, BiologicalThinkerClass biologicalThinkerClass) {
        this.name = name;
        this.biologicalThinkerClass = biologicalThinkerClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BiologicalThinkerClass getBiologicalThinkerClass() {
        return biologicalThinkerClass;
    }

    public void setBiologicalThinkerClass(BiologicalThinkerClass biologicalThinkerClass) {
        this.biologicalThinkerClass = biologicalThinkerClass;
    }
}
