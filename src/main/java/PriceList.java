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

    double result(int inpCode, int inpCount) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == inpCode) {
                System.out.println(inpCount * list.get(i).getPrice());
                return inpCount * list.get(i).getPrice();
            }
        }
        throw new NullPointerException("Product not found");
    }

    void changeProductPrice(int inpCode, double inpNewPrice) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == inpCode) {
                list.get(i).setPrice(inpNewPrice);
            }
        }
    }
    void changeProductName(int inpCode, String inpNewName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == inpCode) {
                list.get(i).setName(inpNewName);
            }
        }
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
