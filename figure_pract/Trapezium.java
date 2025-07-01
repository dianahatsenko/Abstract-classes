
package figure_pract;
// Створення класу трапеції
public class Trapezium extends Figure{
    private double a;
    private double b;
    private double c1;
    private double c2;
    private double h;

    public Trapezium(double a, double b, double c1, double c2, double h) {
        this.a = a;
        this.b = b;
        this.c1 = c1;
        this.c2 = c2;
        this.h = h;
    }

    @Override
    public double getPerimeter(){
        double P=a+b+c1+c2;
        return P;
    }
    @Override
    public double getArea(){
        double A=0.5*(a+b)*h;
        return A;
    }
    public double getA() { return a; }
    public double getB() { return b; }
    public double getC1() { return c1; }
    public double getC2() { return c2; }
    public double getH() { return h; }
      
}
