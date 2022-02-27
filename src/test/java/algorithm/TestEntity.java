package algorithm;

public class TestEntity implements Comparable<TestEntity> {
    private Integer number;
    private String name;

    public TestEntity(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public int compareTo(TestEntity o) {
        return this.number.compareTo(o.number);
    }
}
