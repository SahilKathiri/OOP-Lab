import java.util.Scanner;
import java.util.ArrayList;

abstract class Shape {
    protected int color;
    double area, perim;
    Scanner inp = new Scanner(System.in);

    public void setColor(int n) {color = n;}
    public int getColor() {return color;}

    public abstract void readInput();
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
    public abstract void display();
}

class Rectangle extends Shape {
    private int l, b;

    public void readInput() {
        System.out.println("Enter color, length & breath of rectangle: ");
        color = inp.nextInt();
        l = inp.nextInt();
        b = inp.nextInt();
    }

    public void calculateArea() {
        area = l*b;
    }

    public void calculatePerimeter() {
        perim = 2 * l * b;
    }

    public void display() {
        System.out.println("Rectangle:\nColor: " + color + "\tArea: " + area + "\tPerimeter: " + perim);    
    }
}

class Triangle extends Shape {
    private int b, h;

    public void readInput() {
        System.out.println("Enter color, height & breath of Triangle: ");
        color = inp.nextInt();
        h = inp.nextInt();
        b = inp.nextInt();
    }

    public void calculateArea() {
        area = 0.5 * h * b;
    }

    public void calculatePerimeter() {
        perim = b + h + (Math.sqrt(b*b + h));
    }

    public void display() {
        System.out.println("Triangle:\nColor: " + color + "\tArea: " + area + "\tPerimeter: " + perim);    
    }
}

class Circle extends Shape {
    private int r;

    public void readInput() {
        System.out.println("Enter color & radius of Circle: ");
        color = inp.nextInt();
        r = inp.nextInt();
    }

    public void calculateArea() {
        area = Math.PI * r * r;
    }

    public void calculatePerimeter() {
        perim = 2 * Math.PI * r;
    }

    public void display() {
        System.out.println("Circle\nColor: " + color + "\tArea: " + area + "\tPerimeter: " + perim);    
    }
}

public class ShapeTester {
    public static void main(String[] args) {
        ArrayList<Shape> list = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        boolean end = false;

        while(!end) {
            int a, i = 0;
            System.out.print("Enter the name of the shape: (1:Rect, 2:Circle, 3:Triangle)");
            a = inp.nextInt();

            switch(a) {
                case 0:
                    break;
                case 1: 
                    list.add(i, new Rectangle());
                    list.get(i).readInput();
                    list.get(i).calculatePerimeter();
                    list.get(i).calculateArea();
                    i++;
                    break;
                case 2:  
                    list.add(i, new Circle());
                    list.get(i).readInput();
                    list.get(i).calculatePerimeter();
                    list.get(i).calculateArea();
                    i++;
                    break;
                case 3:
                    list.add(i, new Triangle());
                    list.get(i).readInput();
                    list.get(i).calculatePerimeter();
                    list.get(i).calculateArea();
                    i++;
                    break;
                default:
                    System.out.println("Enter 1, 2, 3 to continue and 0 to quit");
            }
            if (a == 0)
                end = true;
        }

        System.out.println("The area and perimeter of the following shapes are: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print((i+1) + ". ");
            list.get(i).display();    
            System.out.println();
        }
    }    
}
