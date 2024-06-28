public enum ProductType {

    SMARTPHONE ("SMARTPHONE"),
    LAPTOP ("LAPTOP"),
    TABLET ("TABLET"),
    WATCHES ("WATCHES"),
    CASE ("CASE");

    private String name;

    public String getName() {
        return name;
    }

    ProductType(String name) {
        this.name = name;
    }
}
