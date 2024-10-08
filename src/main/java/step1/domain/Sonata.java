package step1.domain;

import step1.domain.vo.DistancePerLiter;
import step1.domain.vo.TripDistance;

public class Sonata implements Car {
    private static final int DISTANCE_PER_LITER = 10;
    private final TripDistance tripDistance;
    private final DistancePerLiter distancePerLiter;

    public Sonata(int tripDistance) {
        this.tripDistance = new TripDistance(tripDistance);
        this.distancePerLiter = new DistancePerLiter(DISTANCE_PER_LITER);
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double getChargeQuantity() {
        return tripDistance.value() / distancePerLiter.value();
    }
}
