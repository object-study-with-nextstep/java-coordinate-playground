package step1.domain;

public class K5 extends Car {
    private final int tripDistance;
    private final int distancePerLiter = 13;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return this.getClass().getSimpleName();
    }
}
