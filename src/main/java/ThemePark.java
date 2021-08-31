import behaviours.IReviewed;
import behaviours.IVisited;
import people.Visitor;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark {

    private ArrayList<IReviewed> allAttractions;
    private HashMap<String, Integer> reviews;

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

    public HashMap<String, Integer> getAllReviews(){
        HashMap<String, Integer> reviews = new HashMap<>();
        for (IReviewed reviewed : getAllReviewed()){
            reviews.put(reviewed.getName(), reviewed.getRating());
        }
        return reviews;
    }
}
