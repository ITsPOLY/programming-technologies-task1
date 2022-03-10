import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PriceListTest {
    @Test
    public void addProduct() {
        Product good = new Product("Swallow", 25.5, 143);
        PriceList expected = new PriceList(good);
        PriceList fact = new PriceList();
        fact.addition(good);
        assertEquals(expected, fact);
    }

    @Test
    public void removeProduct() {
        Product good = new Product("Swallow", 25.5, 143);
        PriceList expected = new PriceList();
        PriceList fact = new PriceList(good);
        fact.removal(good);
        assertEquals(expected, fact);
    }

    @Test
    public void changePrice() {
        Product good = new Product("Swallow", 25.5, 143);
        Product change = new Product("Swallow", 32.0, 143);
        PriceList expected = new PriceList(change);
        PriceList fact = new PriceList(good);
        fact.changeProductPrice(143, 32.0);
        assertEquals(expected, fact);
    }

    @Test
    public void changeName() {
        Product good = new Product("Swallow", 25.5, 143);
        Product change = new Product("Chamomile", 25.5, 143);
        PriceList expected = new PriceList(change);
        PriceList fact = new PriceList(good);
        fact.changeProductName(143, "Chamomile");
        assertEquals(expected, fact);
    }

    @Test
    public void resultSum() {
        Product good = new Product("Swallow", 25.5, 143);
        double expected = 76.5;
        PriceList fact = new PriceList(good);
        assertEquals(expected, fact.result(143, 3));
    }
}
