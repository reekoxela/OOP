import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements SellTelefon {

    private ArrayList<Telefon> listTelefon;

    @Override
    public ArrayList<Telefon> create(ArrayList<Telefon> listTelefon) {

        Telefon nokia = new Telefon("Nokia", "3310", 6.14, 4500, "Android", 12000);
        Telefon samsung = new Telefon("Samsung", "5460", 5.5, 3000, "Android", 22000);
        Telefon apple = new Telefon("Apple", "13Pro", 6.14, 2500, "Ios", 100000);
        Telefon oppo = new Telefon("Oppo", "120+", 5.45, 6000, "Android", 54000);

        listTelefon.add(nokia);
        listTelefon.add(samsung);
        listTelefon.add(apple);
        listTelefon.add(oppo);

        return listTelefon;
    }

    @Override
    public ArrayList<Telefon> sell(ArrayList<Telefon> listTelefon) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Какой телефон купили: ");
        String buyPhone = sc.next();
        sc.close();

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

    @Override
    public ArrayList<Telefon> addPhone(ArrayList<Telefon> listTelefon) {

        Telefon phone = new Telefon();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите название производителя: ");
        String factory = sc.next();
        System.out.println("Введите модель телефона: ");
        String model = sc.next();
        System.out.println("Введите размер экрана: ");
        double size =  sc.nextDouble();
        System.out.println("Введите емкость батареи: ");
        int quantity = sc.nextInt();
        System.out.println("Введите тип операционной системы: ");
        String os = sc.next();
        System.out.println("Введите стоимость телефона: ");
        double price = sc.nextDouble();
        sc.close();

        return listTelefon;
    }


}
