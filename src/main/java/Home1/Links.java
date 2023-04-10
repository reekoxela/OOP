package Home1;

import java.util.ArrayList;

public class Links implements I_FamTies {
    //Список родственников + тип родственной связи
    private ArrayList<Ties> myTies = new ArrayList<>();

    //Связь Мать - Сын
    @Override
    public void MotherSon(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.mother));
        myTies.add(new Ties(child,parent,familyTies.son));
    }

    //Связь Мать - Дочь
    @Override
    public void MotherDaughter(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.mother));
        myTies.add(new Ties(child,parent,familyTies.daughter));
    }

    //Связь Отец - Сын
    @Override
    public void FatherSon(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.father));
        myTies.add(new Ties(child,parent,familyTies.son));
    }

    //Связь Отец - Дочь
    @Override
    public void FatherDaughter(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.father));
        myTies.add(new Ties(child,parent,familyTies.daughter));
    }

    //Связь Брат - Брат
    @Override
    public void BrotherBrother(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.brother));
        myTies.add(new Ties(child,parent,familyTies.brother));
    }

    //Связь Брат - Сестра
    @Override
    public void BrotherSister(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.brother));
        myTies.add(new Ties(child,parent,familyTies.sister));
    }

    //Связь Муж - Жена
    @Override
    public void HusbandWife(Human husband, Human wife) {
        myTies.add(new Ties(husband,wife,familyTies.husband));
        myTies.add(new Ties(wife,husband,familyTies.wife));
    }

    //Возвращаем список родственников и родственных связей
    public ArrayList<Ties> getMyTies() {
        return myTies;
    }
}
