package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(13,134,10);
        visitor2 = new Visitor(11, 178, 50);
        visitor3 = new Visitor(16, 201, 20);

    }


    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void oldEnoughTooSmall(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void tallEnoughTooYoung(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void tallEnoughOldEnough(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void chargeDefaultForUnder200cm(){
        assertEquals(8.40, rollerCoaster.priceFor(visitor1), 0.0);
    }

    @Test
    public void chargeDoubleForOver200cm(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor3), 0.0);
    }
}
