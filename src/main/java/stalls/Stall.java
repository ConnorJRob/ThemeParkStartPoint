package stalls;

import behaviours.IReviewed;
import behaviours.IVisited;

public abstract class Stall implements IReviewed, IVisited{

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int rating;
    private int visitCount;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
        this.visitCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getRating() {
        return rating;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void incrementAttractionVisitCount(){
        this.visitCount += 1;
    }
}
