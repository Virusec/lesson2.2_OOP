package task1;

public class Human {
    private String name;
    private String town;
    private int yearOfBirth;

    public Human(String name, String town, int yearOfBirth) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void printObject() {
        System.out.println(" Привет! Меня зовут " + getName() + ". Я из города "
                + getTown() + ". Я родился в "
                + getYearOfBirth() + " году. Будем знакомы!");
    }
}