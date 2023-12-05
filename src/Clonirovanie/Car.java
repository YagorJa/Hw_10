package Clonirovanie;

public class Car implements Cloneable {
    private String name;
    private Driver driver;

    public Car(String name, Driver driver) {
        this.name = name;
        this.driver = driver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public String toString(){
        return name + " " + driver;
    }
//обычное клониирование
    @Override
    public Car clone() throws CloneNotSupportedException {
        return (Car) super.clone();
    }
    //глубокое клонирование
    public Car cloneDeep() throws CloneNotSupportedException {
        Car newCar = (Car) super.clone();
        Driver driver = this.getDriver().clone();
        newCar.setDriver(driver);
        return newCar;
    }
}
