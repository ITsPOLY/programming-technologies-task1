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
        Product expected = new Product("Swallow", 32.0, 143);
        good.setPrice(32.0);
        assertEquals(expected, good);
    }

    @Test
    public void changeName() {
        Product good = new Product("Swallow", 25.5, 143);
        Product expected = new Product("Chamomile", 25.5, 143);
        good.setName("Chamomile");
        assertEquals(expected, good);
    }

    @Test
    public void resultSum() {
        Product good = new Product("Swallow", 25.5, 143);
        double expected = 76.5;
        PriceList fact = new PriceList(good);
        assertEquals(expected, fact.result(143, 3));
    }
}
