import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Piano;
import Shop.Product;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Drums drums1, drums2;
    private Guitar guitar1,  guitar2;
    private Piano piano1, piano2;
    private Product product1, product2, product3;
    private Shop shop;

    @Before
    public void before(){
        drums1 = new Drums("Ultimate Kit", "Full Kit", "Yamaha", 9);
        drums2 = new Drums("Relax 100", "Beginner Kit", "Sabian",3 );
        guitar1 = new Guitar("3000XS", "Electric", "Fender", 6, "Plastic");
        guitar2 = new Guitar("DeepSound", "Bass", "Laney", 4, "Wood");
        piano1 = new Piano("Classic", "Grand", "Steinhoven", 88, 1);
        piano2 = new Piano("Portable Power","Electric","Casio",61, 300);
        product1 = new Product(drums1, 400, 900);
        product2 = new Product(guitar1, 150, 400);
        product3 = new Product(piano1, 600, 1500);
        shop = new Shop();
    }

    @Test
    public void canAddProducts(){
        shop.addItems(product1);
        shop.addItems(product2);
        shop.addItems(product3);
        assertEquals(Arrays.asList(product1, product2, product3), shop.getStock());
    }

    @Test
    public void canRemoveProducts(){
        shop.addItems(product1);
        shop.addItems(product2);
        shop.addItems(product3);
        shop.removeItems(product2);
        assertEquals(Arrays.asList(product1, product3), shop.getStock());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addItems(product1);
        shop.addItems(product2);
        shop.addItems(product3);
        assertEquals(1650,shop.potentialProfit());
    }

}
