import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 3);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 3);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 3);
        visitor = new Visitor(21, 190, 22);
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(candyflossStall);
        themePark.addAttraction(iceCreamStall);
        themePark.addAttraction(tobaccoStall);
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void canVisitAttractions(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.getVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }
}
