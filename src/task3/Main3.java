package task3;

public class Main3 {
    public static void main(String[] args) {
        Car lada = new Car(null, null, null, null, null, null);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", "черный", "Германия", 3.0, 2020);
        Car bmw = new Car("BMW", "Z8", "черный", "Германия", 3.0, 2021);
        Car kia = new Car("Kia", "Sportage 4 поколение", "красный", "Южная Корея", 2.4, 2018);
        Car hyundai = new Car("Hyundai", "Avante", "оранжевый", "Южная Корея", 1.6, 2016);

        lada.printObject();
        audi.printObject();
        bmw.printObject();
        kia.printObject();
        hyundai.printObject();
    }
}
