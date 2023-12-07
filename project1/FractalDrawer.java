// Written by Sofia Kan, kan00022

// FractalDrawer class draws a fractal of a shape indicated by user input
import java.awt.Color;
import java.util.Scanner;

public class FractalDrawer {
    private double totalArea = 0; // member variable for tracking the total area

    public FractalDrawer() {} // contructor

    private Color getNewColor(int level) {
        return new Color((level * 35) % 255, (level * 50) % 255, (level * 20) % 255);
    }
	//TODO:
	// drawFractal creates a new Canvas object
	// and determines which shapes to draw a fractal by calling appropriate helper function
	// drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas canvas = new Canvas(800, 800);
        if ("circle".equalsIgnoreCase(type)) {
            drawCircleFractal(300, 400, 400, Color.BLUE, canvas, 0);
        } else if ("triangle".equalsIgnoreCase(type)) {
            drawTriangleFractal(400, 400, 200, 550, Color.BLUE, canvas, 0);
        } else if ("rectangle".equalsIgnoreCase(type)) {
            drawRectangleFractal(200, 200, 300, 300, Color.BLUE, canvas, 0);
        }
        return totalArea;
    }

	//TODO:
	// drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level >= 7) return;

        Triangle triangle = new Triangle(x, y, width, height);
        triangle.setColor(c);
        can.drawShape(triangle);
        totalArea += triangle.calculateArea();

        double newWidth = width / 2;
        double newHeight = height / 2;
        drawTriangleFractal(newWidth, newHeight, x, y, getNewColor(level + 1), can, level + 1);
        drawTriangleFractal(newWidth, newHeight, x + newWidth, y, getNewColor(level + 1), can, level + 1);
        drawTriangleFractal(newWidth, newHeight, x + newWidth / 2, y - newHeight, getNewColor(level + 1), can, level + 1);
    }

	// TODO:
	// drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level) {
        if (level >= 7) return;

        Circle circle = new Circle(x, y, radius);
        circle.setColor(c);
        can.drawShape(circle);
        totalArea += circle.calculateArea();

        double newRadius = radius / 2;
        drawCircleFractal(newRadius, x - newRadius, y, getNewColor(level + 1), can, level + 1);
        drawCircleFractal(newRadius, x + newRadius, y, getNewColor(level + 1), can, level + 1);
        drawCircleFractal(newRadius, x, y - newRadius, getNewColor(level + 1), can, level + 1);
        drawCircleFractal(newRadius, x, y + newRadius, getNewColor(level + 1), can, level + 1);
    }

	//TODO:
	// drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level) {
        if (level >= 7) return;

        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setColor(c);
        can.drawShape(rectangle);
        totalArea += rectangle.calculateArea();

        double newWidth = width / 2;
        double newHeight = height / 2;
        drawRectangleFractal(newWidth, newHeight, x - newWidth, y, getNewColor(level + 1), can, level + 1);
        drawRectangleFractal(newWidth, newHeight, x + width, y, getNewColor(level + 1), can, level + 1);
        drawRectangleFractal(newWidth, newHeight, x, y - newHeight, getNewColor(level + 1), can, level + 1);
        drawRectangleFractal(newWidth, newHeight, x, y + height, getNewColor(level + 1), can, level + 1);
    }
	//TODO:
	// main should ask user for shape input, and then draw the corresponding fractal.
	// should print area of fractal
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Choose shape: circle, triangle, or rectangle? ");
        String shape = key.next();

        FractalDrawer drawer = new FractalDrawer();
        double area = drawer.drawFractal(shape);

        System.out.println("Total area of fractal: " + area);
    }
}

