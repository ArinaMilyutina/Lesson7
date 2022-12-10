package task1;
public final class Rectangle extends Figure{
    private int  a;
    private int b;
    public Rectangle( int a,  int b){
        this.a=a;
        this.b=b;
        calculatePerimeter();
        calculateSquare();

    }

    public double getA() {
        return a;
    }

    public void setA( int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB( int b) {
        this.b = b;
    }

    @Override
    public void calculateSquare() {
       double square=a*b;
         setSquare(square);
    }

    @Override
    public void calculatePerimeter() {
     double perimeter=(a+b)*2;
        setPerimeter(perimeter);

    }
}
