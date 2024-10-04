package step1.domain;

public class Avante extends Car {
    private final int tripDistance;
    private final int distancePerLiter = 15;

    public Avante(int tripDistance) {
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
