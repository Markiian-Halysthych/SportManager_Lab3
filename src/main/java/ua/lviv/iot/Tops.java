package ua.lviv.iot;

public class Tops extends Wear {
    private String seasone;

    public Tops() {
    }

    public String getSize() {
        return this.seasone;
    }

    public void setSeasone(String seasone) {
        this.seasone = seasone;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", seasone = " + seasone + ")";
    }

    @Override
    public String getType() {
        return "Tops";
    }
}
