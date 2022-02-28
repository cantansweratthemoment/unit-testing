package text;

public enum BiologicalThinkerClass {
    PERSON("Этот вид придумал колесо, Нью-йорк, войну."), DELPHIN("Этот вид плескался в воде и развлекался.");
    private String achievement;

    BiologicalThinkerClass(String achievement) {
        this.achievement = achievement;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }
}
