/** Listy */

import java.util.ArrayList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("Cars: " + cars);

        for(int i = 0; i < cars.size(); i++) {
            String newCar = "_" + cars.get(i) + "_";
            cars.set(i, newCar);
        }

        System.out.println("Cars: " + cars);

        for(String car : cars) {
            System.out.printf("Car: %s \n", car);
        }
    }
}