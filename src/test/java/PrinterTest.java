import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

        Printer printer;

        @Before
        public void before() {printer = new Printer(100, 100);
        }

        @Test
        public void hasSheets(){
            assertEquals(100, printer.getSheets());
        }

        @Test
        public void hasToner(){
            assertEquals(100, printer.getToner());
        }


    @Test
    public void realPrint(){
            printer.realPrint(7,3);
        assertEquals(79, printer.getToner());
        assertEquals(79, printer.getSheets());
    }
}
