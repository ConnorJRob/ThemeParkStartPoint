import behaviours.IReviewed;
import behaviours.IVisited;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allAttractions;

    public ThemePark() {
        this.allAttractions = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed() {
        return allAttractions;
    }

    public void addAttraction(IReviewed attraction){
        this.allAttractions.add(attraction);
    }

    public void visit(Visitor visitor, IVisited attraction){
        visitor.visitAttraction(attraction);
        attraction.incrementAttractionVisitCount();
    }
}
