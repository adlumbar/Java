/**
 * Holds information for calculating the cost of carpet
 *
 */
public class roomCarpet {

    private roomDimension roomDimensions;
    private double costOfCarpet;

    public roomCarpet(roomDimension roomDimensions, double costOfCarpet) {
        super();
        this.roomDimensions = roomDimensions;
        this.costOfCarpet = costOfCarpet;
    }

    public double getTotalCost() {
        return costOfCarpet * roomDimensions.getArea();
    }

    @Override
    public String toString() {
        return "RoomCarpet [roomDimensions=" + roomDimensions
                + ", costOfCarpet=" + costOfCarpet + ", "
                        + "total cost=" + getTotalCost() + "]";
    }

}
