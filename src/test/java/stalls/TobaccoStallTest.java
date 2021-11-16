package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor over18;
    Visitor under18;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        over18 = new Visitor(19,6.2,50);
        under18 = new Visitor(17, 5.10,20);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void over18CanBuyTobacco(){
        assertEquals(true, tobaccoStall.isAllowedTo(over18));
    }

    @Test
    public void under18CantBuyTobacco(){
        assertEquals(false, tobaccoStall.isAllowedTo(under18));
    }


}
