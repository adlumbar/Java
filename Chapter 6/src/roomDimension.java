/**
 *Room's dimensions and height 
 * 
 *
 */
public class roomDimension {

    private double length;
    private double width;

    public roomDimension(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "RoomDimension [length=" + length + ", width=" + width + "]";
    }

}
