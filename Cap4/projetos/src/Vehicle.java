public class Vehicle {
    int passengers, fuelcap, mpg;

    void range() {
        System.out.println("Range is " + fuelcap * mpg);
    }

    double fuelneede(int miles){
        return (double) miles / mpg;
    }

    public Vehicle() {
    }

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
}
