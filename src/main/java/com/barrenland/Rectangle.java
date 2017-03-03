package com.barrenland;

public class Rectangle {
    private int lowerLeftRow;
    private int lowerLeftColumn;
    private int upperRightRow;
    private int upperRightColumn;

    public Rectangle(int lowerLeftRow, int lowerLeftColumn, int upperRightRow, int upperRightColumn) {
        this.lowerLeftRow = lowerLeftRow;
        this.lowerLeftColumn = lowerLeftColumn;
        this.upperRightRow = upperRightRow;
        this.upperRightColumn = upperRightColumn;
    }

    public int getLowerLeftRow() {
        return lowerLeftRow;
    }

    public int getLowerLeftColumn() {
        return lowerLeftColumn;
    }

    public int getUpperRightRow() {
        return upperRightRow;
    }

    public int getUpperRightColumn() {
        return upperRightColumn;
    }
}
