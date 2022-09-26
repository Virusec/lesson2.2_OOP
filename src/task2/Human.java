package task2;

public class Human {
    String name;
    String town;
    int yearOfBirth;
    String position;

    public Human(String name, String town, int yearOfBirth, String position) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }

        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }

        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
            System.out.println(name + " - не корректно указан год рождения.");
        }

        if (position == null) {
            this.position = "Информация не указана";
        } else {
            this.position = position;
        }
    }

    public void printObject() {
        System.out.println(" Привет! Меня зовут " + name + ". Я из города "
                + town + ". Я родился в "
                + yearOfBirth + " году. Я работаю на должности "
                + position + ". Будем знакомы!");
    }
}
