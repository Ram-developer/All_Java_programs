public class Calculator {
    private Floor floor;
    private Carpet carpet;
    public Calculator(Floor floor,Carpet carpet) {
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost() {
        double xx=floor.getArea();
        double yy=carpet.getCost();
        return xx*yy;
    }
}
