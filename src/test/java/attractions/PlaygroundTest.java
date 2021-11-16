package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;


import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor under15;
    Visitor over15;


    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        under15 = new Visitor(7, 5.2, 10);
        over15 = new Visitor(16,6.0,20);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void under15CanVisit(){
        assertEquals(true, playground.isAllowedTo(under15));
    }

    @Test
    public void over15CantVisit(){
        assertEquals(false, playground.isAllowedTo(over15));
    }
}
