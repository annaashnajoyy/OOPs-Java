package shapes;
public class Rectangle {
double length, width;
public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}
public double area() {
return length * width;
}
}
package shapes;
public class Circle {
double radius;
public Circle(double radius) {
this.radius = radius;
}
public double area() {
return 3.14 * radius * radius;
}
