import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before() {bottle = new Bottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void Drink(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void Empty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void Fill(){
        assertEquals(100, bottle.fill());
    }
}
