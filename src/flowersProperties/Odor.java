package flowersProperties;

public enum Odor {
    GOOD("good"),
    NORMAL("normal"),
    BAD("bad");

    private String name;

    Odor(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Odor{" +
                "name='" + name + '\'' +
                '}';
    }
}
