package Lesson7.HW.Ex4;

public class Car {
    private final String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        private boolean isWorking = false;
        private final int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public String startStopEngine() {
            if (this.isWorking) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
