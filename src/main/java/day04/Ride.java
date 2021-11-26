package day04;

public class Ride {

    private int day;
    private int count;
    private int distance;

    public Ride(int day, int count, int distance) {
        this.day = day;
        this.count = count;
        this.distance = distance;
    }

    public int getDay() {
        return day;
    }

    public int getCount() {
        return count;
    }

    public int getDistance() {
        return distance;
    }
}
