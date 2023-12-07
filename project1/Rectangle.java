// Written by Sofia Kan, kan00022

import java.awt.Color;

public class Rectangle {
    private double xPos; // x position of the upper left corner
    private double yPos; // y position of the upper left corner
    private double width; 
    private double height;
    private Color color;

    // Constructor
    public Rectangle(double xPos, double yPos, double width, double height) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = width;
        this.height = height;
        // Set a default color if not provided
        this.color = Color.BLACK; 
    }

    // Calculate the perimeter of the rectangle
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Calculate the area of the rectangle
    public double calculateArea() {
        return width * height;
    }

    // Set the color of the rectangle
    public void setColor(Color color) {
        this.color = color;
    }

    // Set the position of the rectangle
    public void setPos(double xPos, double yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    // Set the height of the rectangle
    public void setHeight(double height) {
        this.height = height;
    }

    // Set the width of the rectangle
    public void setWidth(double width) {
        this.width = width;
    }

    // Get the color of the rectangle
    public Color getColor() {
        return this.color;
    }

    // Get the x position of the rectangle
    public double getXPos() {
        return this.xPos;
    }

    // Get the y position of the rectangle
    public double getYPos() {
        return this.yPos;
    }

    // Get the height of the rectangle
    public double getHeight() {
        return this.height;
    }

    // Get the width of the rectangle
    public double getWidth() {
        return this.width;
    }
}
