package Home1;

public class Ties {
    Human human1;
    Human human2;
    familyTies ft;

    public Ties(Human human1, Human human2, familyTies ft) {
        this.human1 = human1;
        this.human2 = human2;
        this.ft = ft;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", human1.getName(), human2.getName(), ft);
    }
}