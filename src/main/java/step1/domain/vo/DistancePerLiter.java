package step1.domain.vo;

public class DistancePerLiter {
    private static final int DISTANCE_PER_LITER_LOW_LIMIT = 0;
    private final int distancePerLiter;

    public DistancePerLiter(int distancePerLiter) {
        if (distancePerLiter <= DISTANCE_PER_LITER_LOW_LIMIT) {
            throw new IllegalArgumentException("연비는 0보다 작을 수 없습니다");
        }

        this.distancePerLiter = distancePerLiter;
    }

    public int value() {
        return this.distancePerLiter;
    }
}
