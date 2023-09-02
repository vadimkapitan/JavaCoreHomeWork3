package javacore.oop.homework3;

public class Car extends Transport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}
