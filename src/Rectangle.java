public class Rectangle {

    private double length;
    private double width;

    public Rectangle (double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return (length*width);
    }

    public double getDiagonal() {
        return(Math.sqrt((length*length)+(width*width)));
    }

    public boolean isSquare() {
        return (length == width);
    }
}
