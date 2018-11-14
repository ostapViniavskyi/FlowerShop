package flowersProperties;

public enum Country {
    UKRAINE("Ukraine"),
    NETHERLANDS("Netherlands"),
    FRANCE("France");

    private String name;

    Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
