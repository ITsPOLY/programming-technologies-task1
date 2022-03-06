import java.util.ArrayList;
import java.util.Objects;

public class PriceList {
    ArrayList<Product> list = new ArrayList<>();

    void addition(Product e){
        list.add(e);
    }

    void removal(Product e){
        list.remove(e);
    }

    double result(int a, int b) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == a) {
                System.out.println(b * list.get(i).getPrice());
                return b * list.get(i).getPrice();
            }
        }
        return 0.0;
    }

    PriceList(Product e){
        list.add(e);
    }

    PriceList(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceList priceList = (PriceList) o;
        return Objects.equals(list, priceList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
