
package figure_pract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Circle, input radius: ");
       Scanner scan=new Scanner(System.in);
        double r=scan.nextDouble();
        //Створення об'єкту кола 
        Circle s1=new Circle(r);
        System.out.printf("Area: %.2f\n", s1.getArea());
        System.out.printf("Perimeter: %.2f\n", s1.getPerimeter());
        System.out.println("Rectangle, input information: ");
        System.out.println("Input height: ");
        double a1=scan.nextDouble();
        System.out.println("Input width: ");
        double a2=scan.nextDouble();
        //Створення об'єкту прямокутнику
        Rectangle rec=new Rectangle(a1, a2);
        System.out.printf("Perimeter: %.2f\n", rec.getPerimeter());
        System.out.printf("Area: %.2f\n", rec.getArea());
        System.out.println("Trapezium, input information: ");
        System.out.println("Input base side: ");
        double a=scan.nextDouble();
        System.out.println("Input second base side: ");
        double b=scan.nextDouble();
        System.out.println("Input third side: ");
        double c1=scan.nextDouble();
        System.out.println("Input fourth side: ");
        double c2=scan.nextDouble();
        System.out.println("Input height: ");
        double h=scan.nextDouble();
        //Створення об'єкту трапеції
        Trapezium tr=new Trapezium(a, b, c1, c2, h);
        System.out.printf("Perimeter: %.2f\n", tr.getPerimeter());
        System.out.printf("Area: %.2f\n", tr.getArea());
        
        
        
        
        
        
    }
    
}
