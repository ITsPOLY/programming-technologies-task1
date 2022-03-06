import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int code;

    Product(){
        name = "default";
        price = 0.0;
        code = 0;
    }

    Product(String name, double price, int code){
        this.name = name;
        this.price = price;
        this.code = code;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Name:" + name + ", ").append("Price:" + price + ", ").append("Code:" + code + " ");
        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && code == product.code && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, code);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
}
