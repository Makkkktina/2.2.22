package web.servise;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final List<Car> cars;

    public CarServiceImp() {
        this.cars = new ArrayList<>(List.of(
                new Car("priora", 2012, "Ilyas"),
                new Car("corolla", 2013, "Makka"),
                new Car("Mazeratti", 2024, "Ali"),
                new Car("granta", 2006, "Salavat"),
                new Car("supra", 2018, "Hz")
        ));
    }

    @Override
    public List<Car> getCars(int countCars) {
        int displayedCars = Math.min(countCars, cars.size());
        return cars.subList(0, displayedCars);
    }
}