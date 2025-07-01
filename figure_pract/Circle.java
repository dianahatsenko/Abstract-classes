
package figure_pract;
//Cтворення класу коло
public class Circle extends Figure{
    private double r;

    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getArea(){
        double S=r*r*Math.PI;
        return S; 
    }
    @Override
    public double getPerimeter() {
        double P=2*Math.PI*r;
        return P;
    }
    public double getRadius() { return r; }
    
}
