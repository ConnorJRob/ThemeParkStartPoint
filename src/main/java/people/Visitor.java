package people;

import behaviours.IReviewed;
import behaviours.IVisited;

import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<IVisited> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<IVisited> getVisitedAttractions() {
        return visitedAttractions;
    }

    public void visitAttraction(IVisited attraction){
        this.visitedAttractions.add(attraction);
    }
}
