public class Shirt {
    private String color;
    private double price;
    private ShirtSizeEnum size;

    public Shirt(String color, double price, ShirtSizeEnum size) {
        this.color = color;
        this.price = price;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", size=" + size.getStrValue() +
                '}';
    }
}

