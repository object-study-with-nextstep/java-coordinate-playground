package step1.domain;

public class Sonata extends Car {
    private final int tripDistance;
    private final int distancePerLiter = 10;

    public Sonata(int tripDistance) {
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
