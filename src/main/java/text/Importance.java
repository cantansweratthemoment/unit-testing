package text;

public enum Importance {
    LOW("Абсолютно не важно."), AVERAGE("Нормально."), HIGH("Очень важен.");
    private String name;

    Importance(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
