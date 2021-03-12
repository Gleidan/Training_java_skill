package com.savostikov.practical.ex05;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getVectorLength() {
        double vectorLength;

        vectorLength = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

        return vectorLength;
    }

    public double scalarProduct(Vector vector) {
        double scalar;

        scalar = vector.x * this.x + vector.y * this.y + vector.z * this.z;

        return scalar;
    }

    public Vector crossProduct(Vector vector) {
        double x;
        double y;
        double z;

        x = this.y * vector.z - this.z * vector.y;
        y = this.z * vector.x - this.x * vector.z;
        z = this.x * vector.y - this.y * vector.x;

        return new Vector(x, y, z);
    }

    public double cos(Vector vector) {
        double cos;

        cos = scalarProduct(vector) / (Math.abs(getVectorLength()) * Math.abs(vector.getVectorLength()));

        return cos;
    }

    public Vector add(Vector vector) {
        double x;
        double y;
        double z;

        x = this.x + vector.x;
        y = this.y + vector.y;
        z = this.z + vector.z;

        return new Vector(x, y, z);
    }

    public Vector sub(Vector vector) {
        double x;
        double y;
        double z;

        x = this.x - vector.x;
        y = this.y - vector.y;
        z = this.z - vector.z;

        return new Vector(x, y, z);
    }

    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];

        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return vectors;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
