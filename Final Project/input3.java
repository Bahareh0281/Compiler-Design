public interface Engine {
    void start();
    void stop();
}

public class Car implements Engine {
    private final String model;
    private FuelTank fuelTank;

    public Car(String model) {
        this.model = model;
        this.fuelTank = new FuelTank(50); // Assuming 50 liter capacity
    }

    @Override
    public void start() {
        if (fuelTank.hasFuel()) {
            System.out.println("Car " + model + " started!");
        } else {
            System.out.println("Car " + model + " cannot start: Out of fuel!");
        }
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " stopped.");
    }

    public void addFuel(int amount) {
        fuelTank.addFuel(amount);
    }

    private class FuelTank {
        private final int capacity;
        private int currentFuel;

        public FuelTank(int capacity) {
            this.capacity = capacity;
            this.currentFuel = 0;
        }

        public boolean hasFuel() {
            return currentFuel > 0;
        }

        public void addFuel(int amount) {
            if (amount > 0) {
                currentFuel = Math.min(currentFuel + amount, capacity);
            }
        }
    }
}
