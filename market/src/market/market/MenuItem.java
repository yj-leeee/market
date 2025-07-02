package market.market;

public class MenuItem {
    private String name;
    private int price;
    private int stock;

    public MenuItem(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int quantity) {
        this.stock -= quantity;
    }

    public void addStock(int quantity) {
        this.stock += quantity;
    }
}
