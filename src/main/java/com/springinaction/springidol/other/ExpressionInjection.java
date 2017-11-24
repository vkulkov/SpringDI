package com.springinaction.springidol.other;

public class ExpressionInjection {
    private double multiplier;
    private double randomNumber;
    private double adjustedAmount;
    private double circumference;
    private double average;
    private double remainder;
    private double area;
    private String fullName;
    private boolean equal;
    private boolean hasCapacity;
    private boolean largeCircle;
    private boolean outOfStock;
    private boolean validMail;

    private int total = 100;
    private int count = 20;
    private int radius = 5;
    private String firstName = "Jon";
    private String lastName = "Doe";
    private String kind = "circle";
    private int perimeter = 10000;
    private boolean available = false;
    private String email = "test@example.com";

    public void setMultiplier(double multiplier) {
        this.multiplier = multiplier;
    }

    public void setRandomNumber(double randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setAdjustedAmount(double adjustedAmount) {
        this.adjustedAmount = adjustedAmount;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setRemainder(double remainder) {
        this.remainder = remainder;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEqual(boolean equal) {
        this.equal = equal;
    }

    public void setHasCapacity(boolean hasCapacity) {
        this.hasCapacity = hasCapacity;
    }

    public void setLargeCircle(boolean largeCircle) {
        this.largeCircle = largeCircle;
    }

    public void setOutOfStock(boolean outOfStock) {
        this.outOfStock = outOfStock;
    }

    public void setValidMail(boolean validMail) {
        this.validMail = validMail;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public int getRadius() {
        return radius;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getKind() {
        return kind;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("ExpressionInjection:%n" +
                "multiplier = %f%n" +
                "randomNumber = %f%n" +
                "adjustedAmount = %f%n" +
                "circumference = %f%n" +
                "average = %f%n" +
                "remainder = %f%n" +
                "area = %f%n" +
                "fullName = %s%n" +
                "equal = %b%n" +
                "hasCapacity = %b%n" +
                "largeCircle = %b%n" +
                "outOfStock = %b%n" +
                "validMail = %b%n",
                multiplier, randomNumber, adjustedAmount, circumference, average, remainder, area,
                fullName, equal, hasCapacity, largeCircle, outOfStock, validMail);
    }
}
