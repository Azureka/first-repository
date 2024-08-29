public class Car {
    private static Car car;
    public static void main(String[] args) {
        Car c1 = Car.initCar();
        Car c2 = Car.initCar();
    }

    private Car(){
        System.out.println("Dah first object.");
    }

    public static Car initCar() {
        if(car == null)
            car = new Car();
        
        return car;
    }

    private static void test() {
        System.out.println("Commit to GitHub");
        System.out.println("Version 5");
    }
}