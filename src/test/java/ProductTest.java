import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Piano;
import Shop.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    private Drums drums1, drums2;
    private Guitar guitar1,  guitar2;
    private Piano piano1, piano2;

    private Product product1, product2, product3;

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
    }

    @Test
    public void hasInstrument(){
        assertEquals(drums1, product1.getItem());
        assertEquals(guitar1, product2.getItem());
        assertEquals(piano1, product3.getItem());
    }

    @Test
    public void hasCost(){
        assertEquals(400, product1.getItemCost());
        assertEquals(150, product2.getItemCost());
        assertEquals(600, product3.getItemCost());
    }

    @Test
    public void hasPrice(){
        assertEquals(900, product1.getItemPrice());
        assertEquals(400, product2.getItemPrice());
        assertEquals(1500, product3.getItemPrice());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500, product1.calculateMarkup());
        assertEquals(250, product2.calculateMarkup());
        assertEquals(900, product3.calculateMarkup());
    }
}
