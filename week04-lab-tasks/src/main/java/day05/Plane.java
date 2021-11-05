package day05;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private int maxCapacity;
    private List<Passenger> passengers = new ArrayList<>();

    public Plane(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public boolean addPassenger(Passenger passenger){
        if(passengers.size()<maxCapacity){
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages(){
        int s = 0;
        for (Passenger p :
                passengers) {
            s+=p.getPackages();
        }
        return s;
    }
}
