import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        AddPhones addphone = new AddPhones();
        ArrayList<Telefon> listTelefon = new ArrayList<>();
        addphone.create(listTelefon);

        PrintPhones printPhones = new PrintPhones();
        printPhones.printPhone(listTelefon);

        ShopPhone shopphone = new ShopPhone();
        shopphone.sell(listTelefon);
        System.out.println("\nОстались следующие телефоны: ");
        printPhones.printPhone(listTelefon);
    }
}