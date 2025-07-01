
package figure_pract;


import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Picture picture = new Picture();
        
        System.out.println("Circle, input radius: ");
        double r=scan.nextDouble();
        Circle s1=new Circle(r);
        System.out.printf("Area: %.2f\n", s1.getArea());
        System.out.printf("Perimeter: %.2f\n", s1.getPerimeter());
        System.out.println("Rectangle, input information: ");
        System.out.println("Input height: ");
        double a1=scan.nextDouble();
        System.out.println("Input width: ");
        double a2=scan.nextDouble();
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
        Trapezium tr=new Trapezium(a, b, c1, c2, h);
        System.out.printf("Perimeter: %.2f\n", tr.getPerimeter());
        System.out.printf("Area: %.2f\n", tr.getArea());
        System.out.printf("\nSecond part.\n");
        // Додати фігури
        picture.addFigure(s1);
        picture.addFigure(rec);
        picture.addFigure(tr);

        // Вивести фігури
        picture.printAll();

        // Загальна площа і периметр
        System.out.printf("Total Area: %.2f\n", picture.getTotalArea());
        System.out.printf("Total Perimeter: %.2f\n", picture.getTotalPerimeter());

        // Сортування
        picture.sortByArea();
        System.out.println("Sorted by Area:");
        picture.printAll();

        // Збереження у файл
        try {
            picture.saveToFile("figures.txt");
            System.out.println("Saved to figures.txt");
        } catch (Exception e) {
            System.out.println("Saving error: " + e.getMessage());
        }

        // Завантаження з файлу
        try {
            Picture loaded = new Picture();
            loaded.loadFromFile("figures.txt");
            System.out.println("Loaded from file:");
            loaded.printAll();
        } catch (Exception e) {
            System.out.println("Loading error: " + e.getMessage());
        }
    }
}
