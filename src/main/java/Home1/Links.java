package Home1;

import java.util.ArrayList;

public class Links implements FamTies{
    private ArrayList<Ties> myTies = new ArrayList<>();

    @Override
    public void MotherSon(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.mother));
        myTies.add(new Ties(child,parent,familyTies.son));
    }
    @Override
    public void MotherDaughter(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.mother));
        myTies.add(new Ties(child,parent,familyTies.daughter));
    }

    @Override
    public void FatherSon(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.father));
        myTies.add(new Ties(child,parent,familyTies.son));
    }

    @Override
    public void FatherDaughter(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.father));
        myTies.add(new Ties(child,parent,familyTies.daughter));
    }

    @Override
    public void BrotherBrother(Human parent, Human child) {
        myTies.add(new Ties(parent,child,familyTies.brother));
        myTies.add(new Ties(child,parent,familyTies.brother));
    }

    @Override
    public void HusbandWife(Human husband, Human wife) {
        myTies.add(new Ties(husband,wife,familyTies.wife));
        myTies.add(new Ties(wife,husband,familyTies.husband));
    }

    public ArrayList<Ties> getMyTies() {
        return myTies;
    }
}
