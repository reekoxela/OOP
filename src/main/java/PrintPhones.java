import java.util.ArrayList;

public class PrintPhones {

    public void printPhone(ArrayList<Telefon> listPhones) {
        for (Telefon temp: listPhones) {
            System.out.printf("Марка/модель: %s, диагональ экрана: %s, емкость АКБ: %s, тип ОС: %s, цена: %s\n",
                    temp.getNameFactory() + " " + temp.getModel(),temp.getSizeDisplay(),temp.getQuantityAkb(),
                    temp.getTypeOS(),temp.getPrice());
        }
    }
}
