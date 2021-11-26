package day04;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        if (isRideValid(ride)) {
            rides.add(ride);
        } else {
            throw new IllegalArgumentException("invalid ride");
        }
    }

    private boolean isRideValid(Ride ride) {
        if (rides.isEmpty()) {
            return true;
        } else {
            Ride lastValidRide = rides.get(rides.size() - 1);
            return ride.getDay() > lastValidRide.getDay()
                    || (ride.getDay() == lastValidRide.getDay() && ride.getCount() > lastValidRide.getCount());
        }
    }

    public List<Ride> getRides() {
        return List.copyOf(rides);
    }
}
