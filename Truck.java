public class Truck implements Vehicle{
    private String type;
    private int week;
    int rate=500;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    @Override
    public double calculateRentalCost() {
        return rate*week;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type : "+type);
        System.out.println("Week Rental Rate : "+rate);
        System.out.println("Rental Cost : "+calculateRentalCost());
    }
}
