import java.util.ArrayList;
import java.util.Scanner;

public class ShopPhone implements I_ShopPhones{

    @Override
    public ArrayList<Telefon> sell(ArrayList<Telefon> listTelefon) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nКакой телефон купили: ");

        String buyPhone = input.next();
        input.close();

        ArrayList<Telefon> tempList = new ArrayList<>();
        for (Telefon telefon: listTelefon) {
            if (!buyPhone.equals(telefon.getNameFactory())){
                tempList.add(telefon);
            }
        }
        listTelefon.clear();
        listTelefon.addAll(tempList);
        return listTelefon;
    }
}
