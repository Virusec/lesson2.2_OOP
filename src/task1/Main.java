package task1;

public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", "Минск", 1987);
        Human anya = new Human("Аня", "Москва", 1993);
        Human katya = new Human("Катя", "Минск", 1994);
        Human artem = new Human("Артем", "Москва", 1995);

        maksim.printObject();
        anya.printObject();
        katya.printObject();
        artem.printObject();
    }
}
