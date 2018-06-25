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
        public void print(){
            assertEquals(79, printer.print());
        }

        @Test
        public void toner(){
            assertEquals(79, printer.toner());
        }
}
