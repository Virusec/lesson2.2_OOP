package task3;

public class Car {
    String brand;
    String model;
    String color;
    String productionCountry;
    Double engineVolume;
    Integer productionYear;

    public Car(String brand, String model, String color, String productionCountry, Double engineVolume, Integer productionYear) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }

        if (engineVolume == null) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (productionYear == null) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
    }


    public void printObject() {
        System.out.println(brand + " " + model + ", сборка "
                + productionCountry + ", цвет " + color + ", объём двигателя - "
                + engineVolume + " литра, год выпуска - " + productionYear);

    }
}
