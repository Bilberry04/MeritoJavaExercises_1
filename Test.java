import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Point point = new Point();

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());

        point.incrementX();
        point.incrementY();

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());

        point.setX(10);
        point.setY(-5);

        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.getCoords());
    }
}

class Student {
    private String name;
    private String surname;

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFullName() {
        return name + " " + surname;
    }
}

class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCoords() {
        return "(" + x + ", " + y + ")";
    }

    public void incrementX() {
        this.x++;
    }

    public void incrementY() {
        this.y++;
    }
}
