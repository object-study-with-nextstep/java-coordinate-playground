package step1.domain;

import step1.domain.vo.DistancePerLiter;
import step1.domain.vo.TripDistance;

public class K5 implements Car {
    private static final int DISTANCE_PER_LITER = 13;
    private final TripDistance tripDistance;
    private final DistancePerLiter distancePerLiter;

    public K5(int tripDistance) {
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
