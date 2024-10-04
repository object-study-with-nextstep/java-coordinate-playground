package step1.domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private final List<Car> rentCars = new ArrayList<>();

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        this.rentCars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car rentCar : rentCars) {
            sb.append(rentCar.getName());
            sb.append(" : ");
            sb.append((int) rentCar.getChargeQuantity());
            sb.append("리터");
            sb.append("\n");
        }
        return sb.toString();
    }
}
