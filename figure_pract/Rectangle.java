
package figure_pract;
//Створення класу прямокутник
public class Rectangle extends Figure {
    private double a1;
    private double a2;

    public Rectangle(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
    @Override
    public double getArea() {
        double S=a1*a2;
        return S;
    }
    @Override
    public double getPerimeter(){
        double P=a1+a2+a1+a2;
        return P;
    }
    public double getA1() { return a1; }
    public double getA2() { return a2; }

    
}
