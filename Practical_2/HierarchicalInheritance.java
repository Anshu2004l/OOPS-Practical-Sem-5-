
class Shape {

    void display() {
        System.out.println("This is a Shape");
    }
}

class Circle extends Shape {

    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {

    int length = 10;
    int breadth = 5;

    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.calculateArea();

        System.out.println("----------------");

        r.display();
        r.calculateArea();
    }
}
