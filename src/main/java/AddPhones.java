import java.util.ArrayList;
import java.util.Scanner;

public class AddPhones implements I_AddPhones {

    private ArrayList<Telefon> phoneList;

    @Override
    public ArrayList<Telefon> create(ArrayList<Telefon> phoneList) {

        Telefon nokia = new Telefon("Nokia", "3310", "240x204", 2000, "Nokia", 1448);
        Telefon samsung = new Telefon("Samsung", "Galaxy S23", "Full HD", 4000, "Android 13", 63990);
        Telefon apple = new Telefon("Apple", "iPhone 14 Pro", "2556x1179", 3000, "iOS", 109990);
        Telefon oppo = new Telefon("Oppo", "Reno 9 Pro+", "1080x2408", 4700, "Android 13", 55633);
        Telefon xiaomi = new Telefon("Xiaomi", "13 Pro", "3200x1440", 4820, "Android 13", 87980);

        phoneList.add(nokia);
        phoneList.add(samsung);
        phoneList.add(apple);
        phoneList.add(oppo);

        return phoneList;
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