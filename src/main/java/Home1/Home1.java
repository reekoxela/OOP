package Home1;

import java.util.ArrayList;
import java.util.List;

public class Home1 {
    public static void main(String[] args) {
        //Список родственников
        Human alexanderIvanov = new Human("Alexander Ivanov", 42, "Ведущий специалист");
        Human juliaIvanova = new Human("Julia Ivanova", 36, "Индивидуальный предприниматель");
        Human alexeyKostin = new Human("Alexey Kostin", 42, "Служащий");
        Human alexeayKaptsov = new Human("Alexeay Kaptsov", 39, "Заведующий складом");
        Human timofeyIvanov = new Human("Timofey Ivanov", 11, "Школьник");
        Human ilyaIvanov = new Human("Ilya Ivanov", 6, "Дошкольник");
        Human arinaKostina = new Human("Arina Kostina", 9, "Школьник");
        Human kristinaKaptsova = new Human("Kristina Kaptsova", 14, "Школьник");
        Human ludmilaKostina = new Human("Ludmila Kostina", 51, "Зам. заведующего по АХР");

        Links links = new Links();

        //Создаем родственные связи
        links.HusbandWife(alexanderIvanov, juliaIvanova);
        links.FatherSon(alexanderIvanov, timofeyIvanov);
        links.FatherSon(alexanderIvanov, ilyaIvanov);
        links.MotherSon(juliaIvanova, timofeyIvanov);
        links.MotherSon(juliaIvanova, ilyaIvanov);
        links.BrotherBrother(timofeyIvanov, ilyaIvanov);
        links.FatherDaughter(alexeyKostin,arinaKostina);
        links.BrotherSister(timofeyIvanov, arinaKostina);
        links.BrotherSister(ilyaIvanov, arinaKostina);
        links.MotherDaughter(ludmilaKostina, arinaKostina);

        ArrayList<Ties> myties = links.getMyTies();
        //Ищем и выводим родственные связи Александра Иванова
        for (Ties t : myties) {
            if (t.human1.getName() == "Alexander Ivanov") {
                System.out.println(t.human1.getName() + " is " + t.ft + " " + t.human2.getName());
            }
        }
        System.out.println("-------------------------------------------------------------------");

        //Ищем и выводим родственные связи Тимофея Иванова
        for (Ties t : myties) {
            if (t.human1.getName() == "Timofey Ivanov") {
                System.out.println(t.human1.getName() + " is " + t.ft + " " + t.human2.getName());
            }
        }
        System.out.println("-------------------------------------------------------------------");

        //Ищем и выводим родственные связи Арины Костиной
        for (Ties t : myties) {
            if (t.human1.getName() == "Arina Kostina") {
                System.out.println(t.human1.getName() + " is " + t.ft + " " + t.human2.getName());
            }
        }
        System.out.println("-------------------------------------------------------------------");
    }
}