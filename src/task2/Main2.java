package task2;

public class Main2 {
    public static void main(String[] args) {
        Human maksim = new Human(null,null, -1976, null);
        Human anya = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human katya = new Human("Катя", "Минск", 1994, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");


        maksim.printObject();
        anya.printObject();
        katya.printObject();
        artem.printObject();
    }
}
