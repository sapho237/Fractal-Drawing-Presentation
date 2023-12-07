// Written by Sofia Kan, kan00022

import java.awt.Color;

public class Circle {
    private double xPos;
    private double yPos;
    private double radius;
    private Color color;

    // Constructor
    public Circle(double xPos, double yPos, double radius) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.radius = radius;
        // Set a default color if not provided
        this.color = Color.BLACK; 
    }

    // Calculate the perimeter of the circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Set the color of the circle
    public void setColor(Color color) {
        this.color = color;
    }

    // Set the position of the circle
    public void setPos(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // Set the radius of the circle
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get the color of the circle
    public Color getColor() {
        return this.color;
    }

    // Get the x position of the circle
    public double getXPos() {
        return this.xPos;
    }

    // Get the y position of the circle
    public double getYPos() {
        return this.yPos;
    }

    // Get the radius of the circle
    public double getRadius() {
        return this.radius;
    }
}
