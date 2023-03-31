package Home1;

import java.util.ArrayList;
import java.util.List;

public class Home1 {
    public static void main(String[] args) {
        Human alexanderIvanov = new Human("Alexander Ivanov", 42);
        Human juliaIvanova = new Human("Julia Ivanova", 36);
        Human alexeyKostin = new Human("Alexey Kostin", 42);
        Human alexeayKaptsov = new Human("Alexey Kaptsov", 39);
        Human timofeyIvanov = new Human("Timofey Ivanov", 11);
        Human ilyaIvanov = new Human("Ilya Ivanov", 6);
        Human arinaKostina = new Human("Arina Kostina", 9);
        Human kristinaKaptsova = new Human("Kristina Kaptsova", 14);

        Links links = new Links();

        links.HusbandWife(alexanderIvanov, juliaIvanova);
        links.FatherSon(alexanderIvanov, timofeyIvanov);
        links.FatherSon(alexanderIvanov, ilyaIvanov);
        links.MotherSon(juliaIvanova, timofeyIvanov);
        links.MotherSon(juliaIvanova, ilyaIvanov);
        links.BrotherBrother(timofeyIvanov, ilyaIvanov);

        ArrayList<Ties> myties = links.getMyTies();

        for (Ties t : myties) {
            if (t.human1.getName() == "Alexander Ivanov") {
                System.out.println(t.human1.getName() + " is " + t.ft + " " + t.human2.getName());
            }
        }
        System.out.println("----------------------------------------");
        for (Ties t : myties) {
            if (t.human1.getName() == "Timofey Ivanov") {
                System.out.println(t.human1.getName() + " is " + t.ft + " " + t.human2.getName());
            }
        }
    }
}