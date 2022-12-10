package task1;
public final class Circle extends Figure{
    private double r;
    public static final double pi=3.14;

    public Circle(double r) {

        this.r = r;
        calculatePerimeter();
        calculateSquare();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void calculateSquare() {
         double square=r*r*pi;
         setSquare(square);
    }

    @Override
    public void calculatePerimeter() {
         double perimeter=2*r*pi;
         setPerimeter(perimeter);
    }
}
