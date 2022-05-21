import Instruments.Drums;
import Instruments.Guitar;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentsTest {

    private Drums drums1, drums2;
    private Guitar guitar1, guitar2;
    private Piano piano1, piano2;

    @Before
    public void before(){
        drums1 = new Drums("Ultimate Kit", "Full Kit", "Yamaha", 9);
        drums2 = new Drums("Relax 100", "Beginner Kit", "Sabian",3 );
        guitar1 = new Guitar("3000XS", "Electric", "Fender", 6, "Plastic");
        guitar2 = new Guitar("DeepSound", "Bass", "Laney", 4, "Wood");
        piano1 = new Piano("Classic", "Grand", "Steinhoven", 88, 1);
        piano2 = new Piano("Portable Power","Electric","Casio",61, 300);
    }

    @Test
    public void hasName(){
        assertEquals("Ultimate Kit", drums1.getName());
        assertEquals("DeepSound", guitar2.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Electric", guitar1.getType());
        assertEquals("Electric", piano2.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Sabian", drums2.getBrand());
        assertEquals("Casio", piano2.getBrand());
    }

    @Test
    public void hasUniqueAttributes(){
        assertEquals(9, drums1.getNumberOfPieces());
        assertEquals(4, guitar2.getNumberOfStrings());
        assertEquals("Plastic", guitar1.getMaterial());
        assertEquals(9, drums1.getNumberOfPieces());
        assertEquals(88, piano1.getNumberOfKeys());
        assertEquals(300, piano2.getNumberOfTones());
    }


    @Test
    public void canPlaySound(){
        assertEquals("Dum Dum Dum", drums1.play());
        assertEquals("Wah Wah Wee Wah", guitar1.play());
        assertEquals("Beautiful Melody", piano1.play());
    }

}
