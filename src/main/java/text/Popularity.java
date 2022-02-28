package text;

public enum Popularity {
    LOW("Не популярен."), AVERAGE("Нормально."), HIGH("Широко известен.");
    private String name;

    Popularity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
