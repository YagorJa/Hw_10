package Clonirovanie;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Рено логан", new Driver("Толик, 5 звёзд", 45));
        Car clonedCar = car.clone();
        System.out.println("Оригинал:\t" + car.toString());
        System.out.println("Клон:   \t" + clonedCar.toString());

        Driver clonedCarDriver = clonedCar.getDriver();
        clonedCarDriver.setName("Володя");
        clonedCar.setName("Лексус");

        System.out.println("Оригинал после изменения имени водителя:\t" + car);
        System.out.println("Клон после изменения имени водителя:   \t\t" + clonedCar);
    }

}
