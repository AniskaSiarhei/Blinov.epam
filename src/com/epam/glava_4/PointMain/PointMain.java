package com.epam.glava_4.PointMain;

public class PointMain {
    public static void main(String[] args) {
        PointReport report = new PointReport();
        Point1D point1D = new Point1D(-7);
        report.printReport(point1D);

        Point2D point2D = new Point2D(3,4);
        report.printReport(point2D);

        Point3D point3D = new Point3D(3,4,5);
        report.printReport(point3D);

        Point1DCreator creator1 = new Point2DCreator();
        Point1D pointA = creator1.create();
        System.out.println(pointA);

        Point2DCreator creator2 = new Point2DCreator();
        Point2D pointB = creator2.create();
        System.out.println(pointB);
    }
}
