public class OperationsOfSquareAndRectangleMain
{
    double side;
    int length;
    int width;

    public OperationsOfSquareAndRectangleMain(double side)
    {
        this.side = side;
    }
    public double areaOfSquare() {
        return side*side;
    }
    public double perimeterOfSquare() {
        return 4*side;
    }

    public OperationsOfSquareAndRectangleMain(int length,int width)
    {
        this.length=length;
        this.width = width;
    }
    public int areaOfRectangle() {
        return length*width;
    }

    public int perimeterOfRectangle() {
        return 2*(length+width);
    }
}
