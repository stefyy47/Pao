package proiect;

public class Show {
    protected String name;
    protected float startingHour;
    protected float endingHour;
    protected int minimumAge;
    private double price;
    public Show(String name, float startingHour, float endingHour, double price, int minimumAge){
        this.name = name;
        this.startingHour = startingHour;
        this.endingHour = endingHour;
        this.price = price;
        this.minimumAge = minimumAge;
    }
    public Show(){}

    public void setStartingHour(float startingHour) {
        this.startingHour = startingHour;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setEndingHour(float endingHour) {
        this.endingHour = endingHour;
    }

    public String getName() {
        return name;
    }

    public float getStartingHour() {
        return startingHour;
    }

    public float getEndingHour() {
        return endingHour;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder afisare = new StringBuilder();
        afisare.append("The name of the show is ");
        afisare.append(name);
        afisare.append(". It start at ");
        afisare.append(startingHour);
        afisare.append(" and ends at ");
        afisare.append(endingHour);
        afisare.append(".");
        String temp = new String(afisare);
        return temp;
    }
}
