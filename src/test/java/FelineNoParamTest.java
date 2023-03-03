import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineNoParamTest extends BaseTest {

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testKetKittens() {
        Feline feline = new Feline();
        assertEquals("Должно быть - 1", 1, feline.getKittens());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals("Должно быть - 1", 1, feline.getKittens());
    }
}

