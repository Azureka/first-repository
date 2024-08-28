public class Car {
    private static Car car;
    public static void main(String[] args) {
        Car c1 = Car.initCar();
        Car c2 = Car.initCar();
        System.out.println("Version 2");  
        System.out.println("Version 3");          
    }

    private Car(){
        System.out.println("Dah first object.");
    }

    public static Car initCar() {
        if(car == null)
            car = new Car();
        
        return car;
    }
}