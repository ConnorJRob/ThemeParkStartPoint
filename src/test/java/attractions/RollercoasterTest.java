package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor shortVisitor;
    Visitor youngVisitor;
    Visitor shortANDYoungVisitor;
    Visitor eligibleVisitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        shortVisitor = new Visitor(15, 120, 22);
        youngVisitor = new Visitor(11, 150, 20);
        shortANDYoungVisitor = new Visitor(11, 110, 10);
        eligibleVisitor = new Visitor(15, 205, 22);
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
    public void hasAgeRestriction(){
        assertFalse(rollerCoaster.isAllowedTo(youngVisitor));
    }

    @Test
    public void hasHeightRestriction(){
        assertFalse(rollerCoaster.isAllowedTo(shortVisitor));
    }

    @Test
    public void hasAgeAndHeightRestriction(){
        assertFalse(rollerCoaster.isAllowedTo(shortANDYoungVisitor));
    }

    @Test
    public void ageAndHeightRestrictionAllowsEligibleVisitor(){
        assertTrue(rollerCoaster.isAllowedTo(eligibleVisitor));
    }

    @Test
    public void priceDoublesForOver200Height(){
        assertEquals(16.80, rollerCoaster.priceFor(eligibleVisitor), 0);
    }

}
