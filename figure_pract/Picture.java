package figure_pract;

import java.util.*;
import java.io.*;
// Список для зберігання фігур
public class Picture {
    private List<Figure> figures;

    public Picture() {
        figures = new ArrayList<>();
    }
// Додає фігуру до списку
    public void addFigure(Figure f) {
        figures.add(f);
    }
// Виводить усі фігури з їхніми параметрами, площею та периметром
    public void printAll() {
        for (Figure f : figures) {
            if (f instanceof Rectangle) {
                    Rectangle r = (Rectangle) f;
                    System.out.printf("Rectangle %.2f %.2f\n", r.getA1(), r.getA2());
                } else if (f instanceof Circle) {
                    Circle c = (Circle) f;
                    System.out.printf("Circle %.2f\n", c.getRadius());
                } else if (f instanceof Trapezium) {
                    Trapezium t = (Trapezium) f;
                    System.out.printf("Trapezium %.2f %.2f %.2f %.2f %.2f\n",
                            t.getA(), t.getB(), t.getC1(), t.getC2(), t.getH());
                }
            System.out.printf(" Area = %.2f, Perimeter = %.2f\n",f.getArea(), f.getPerimeter());
        }
    }
//Функція для знаходження загальної площі
    public double getTotalArea() {
        double total = 0;
        for (Figure f : figures) {
            total += f.getArea();
        }
        return total;
    }
//Функція для знаходження загального периметру
    public double getTotalPerimeter() {
        double total = 0;
        for (Figure f : figures) {
            total += f.getPerimeter();
        }
        return total;
    }
// Сортує список фігур за зростанням площі
    public void sortByArea() {
        figures.sort(Comparator.comparingDouble(Figure::getArea));
    }
// Сортує список фігур за зростанням периметра
    public void sortByPerimeter() {
        figures.sort(Comparator.comparingDouble(Figure::getPerimeter));
    }
//Функція для збереження фігури в текстовий файл
    public void saveToFile(String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Figure f : figures) {
                if (f instanceof Rectangle) {
                    Rectangle r = (Rectangle) f;
                    writer.printf("Rectangle %.2f %.2f\n", r.getA1(), r.getA2());
                } else if (f instanceof Circle) {
                    Circle c = (Circle) f;
                    writer.printf("Circle %.2f\n", c.getRadius());
                } else if (f instanceof Trapezium) {
                    Trapezium t = (Trapezium) f;
                    writer.printf("Trapezium %.2f %.2f %.2f %.2f %.2f\n",
                            t.getA(), t.getB(), t.getC1(), t.getC2(), t.getH());
                }
            }
        }
    }
// Зчитує фігури з текстового файлу та додає їх у список
    public void loadFromFile(String filename) throws IOException {
        figures.clear();
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            while (scanner.hasNext()) {
                String type = scanner.next();
                switch (type) {
                    case "Rectangle":
                        double a1 = scanner.nextDouble();
                        double a2 = scanner.nextDouble();
                        figures.add(new Rectangle(a1, a2));
                        break;
                    case "Circle":
                        double r = scanner.nextDouble();
                        figures.add(new Circle(r));
                        break;
                    case "Trapezium":
                        double a = scanner.nextDouble();
                        double b = scanner.nextDouble();
                        double c1 = scanner.nextDouble();
                        double c2 = scanner.nextDouble();
                        double h = scanner.nextDouble();
                        figures.add(new Trapezium(a, b, c1, c2, h));
                        break;
                }
            }
        }
    }
}

