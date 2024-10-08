package step1.domain.vo;

public class TripDistance {
    private static final int TRIP_DISTANCE_LOW_LIMIT = 0;
    private final int tripDistance;

    public TripDistance(int tripDistance) {
        if (tripDistance <= TRIP_DISTANCE_LOW_LIMIT) {
            throw new IllegalArgumentException("여행 거리는 0보다 작을 수 없습니다");
        }
        this.tripDistance = tripDistance;
    }


    public int value() {
        return tripDistance;
    }
}
