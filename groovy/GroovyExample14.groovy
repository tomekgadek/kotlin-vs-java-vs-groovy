/** Listy */


def cars = ["Volvo", "BMW", "Ford", "Mazda"]

println "Cars: $cars"

for(int i = 0; i < cars.size(); i++) {
    String newCar = "_" + cars.get(i) + "_"
    cars.set(i, newCar)
}

println "Cars: $cars"

for(car in cars) {
    println "Car: $car"
}
