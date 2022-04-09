package com.epam.rd.autotasks.intersection;

public class Line {

    int k;
    int b;
    //constructors
    public Line() {}

    public Line(int k, int b) {
    this.k = k;
    this.b = b;
    }

    //method, type of return object is Point
    public Point intersection(Line other) {
        //throw new UnsupportedOperationException();
        int x, y;
        if (k == other.k) {
            return null;
        }
        x = (other.b - b) / (k - other.k);
        y = k * x + b;
        return new Point(x, y);
    }

}
