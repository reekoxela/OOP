import java.util.Objects;

public class Telefon {
    private String nameFactory;
    private String model;
    private String sizeDisplay;
    private int quantityAkb;
    private String TypeOS;
    private double price;

    public Telefon() {
    }

    public Telefon(String nameFactory, String model, String sizeDisplay, int quantityAkb, String typeOS, double price) {
        this.nameFactory = nameFactory;
        this.model = model;
        this.sizeDisplay = sizeDisplay;
        this.quantityAkb = quantityAkb;
        TypeOS = typeOS;
        this.price = price;
    }

    public String getNameFactory() {
        return nameFactory;
    }

    public String getModel() {
        return model;
    }

    public String getSizeDisplay() {
        return sizeDisplay;
    }

    public int getQuantityAkb() {
        return quantityAkb;
    }

    public String getTypeOS() {
        return TypeOS;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefon telefon = (Telefon) o;
        return Objects.equals(sizeDisplay,telefon.sizeDisplay) && quantityAkb == telefon.quantityAkb && Double.compare(telefon.price, price) == 0 && Objects.equals(nameFactory, telefon.nameFactory) && Objects.equals(model, telefon.model) && Objects.equals(TypeOS, telefon.TypeOS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFactory, model, sizeDisplay, quantityAkb, TypeOS, price);
    }

    @Override
    public String toString() {
        return "Telefon{" +
                "nameFactory='" + nameFactory + '\'' +
                ", model='" + model + '\'' +
                ", sizeDisplay=" + sizeDisplay +
                ", quantityAkb=" + quantityAkb +
                ", TypeOS='" + TypeOS + '\'' +
                ", price=" + price +
                '}';
    }
}