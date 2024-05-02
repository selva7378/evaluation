package model;

public class Lift {
    String name;
    int floor;
    int noOfStops;
    int capacity;
    int noOfPeople;


    public int getNoOfPeople() {
        return noOfPeople;
    }

    public void setNoOfPeople(int noOfPeople) {
        this.noOfPeople = noOfPeople;
    }



    public Lift(String name, int floor, int noOfStops, int capacity, int noOfPeople){
        this.name = name;
        this.floor = floor;
        this.noOfStops  = noOfStops;
        this.capacity = capacity;
        this.noOfPeople = noOfPeople;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfStops() {
        return noOfStops;
    }

    public void setNoOfStops(int noOfStops) {
        this.noOfStops = noOfStops;
    }
}
