package text;

public class Fact {
    private String wording;
    private Importance importance;
    private Popularity popularity;

    public String getWording() {
        return wording;
    }

    public void setWording(String wording) {
        this.wording = wording;
    }

    public Importance getImportance() {
        return importance;
    }

    public void setImportance(Importance importance) {
        this.importance = importance;
    }

    public Popularity getPopularity() {
        return popularity;
    }

    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    public Fact(String wording, Importance importance, Popularity popularity) {
        this.wording = wording;
        this.importance = importance;
        this.popularity = popularity;
    }
}
