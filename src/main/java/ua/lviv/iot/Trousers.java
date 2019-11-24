package ua.lviv.iot;

public class Trousers extends Wear {
    private String size;

    public Trousers() {
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", size = " + size + ")";
    }

    @Override
    public String getType() {
        return "Trousers";
    }
}
