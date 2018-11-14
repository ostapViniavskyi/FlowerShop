package flowersProperties;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue");
    private String name;

    Color(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                '}';
    }
}
