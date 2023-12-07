// Written by Sofia Kan, kan00022

import java.awt.Color;

public class Triangle {
    private double xPos; // x position of the bottom left corner
    private double yPos; // y position of the bottom left corner
    private double width; 
    private double height;
    private Color color;

    // Constructor
    public Triangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        // Set a default color if not provided
        this.color = Color.BLACK; 
    }

    // Calculate the perimeter of the triangle (assuming it's isosceles)
    public double calculatePerimeter() {
        double sideLength = Math.sqrt((width / 2 * width / 2) + (height * height));
        return width + (2 * sideLength);
    }

    // Calculate the area of the triangle
    public double calculateArea() {
        return 0.5 * width * height;
    }

    // Set the color of the triangle
    public void setColor(Color color) {
        this.color = color;
    }

    // Set the position of the triangle
    public void setPos(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // Set the height of the triangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Set the width of the triangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Get the color of the triangle
    public Color getColor() {
        return this.color;
    }

    // Get the x position of the triangle
    public double getXPos() {
        return this.xPos;
    }

    // Get the y position of the triangle
    public double getYPos() {
        return this.yPos;
    }

    // Get the height of the triangle
    public double getHeight() {
        return this.height;
    }

    // Get the width of the triangle
    public double getWidth() {
        return this.width;
    }
}
