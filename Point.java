public class Point {
    private double X;
    private double Y;

    public Point(double X, double Y) {
        // Constructor to initialize the Point object with x and y coordinates
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        // Getter method to retrieve the x-coordinate of the Point
        return X;
    }

    public double getY() {
        // Getter method to retrieve the y-coordinate of the Point
        return Y;
    }

    public void setX(double X) {
        // Setter method to set the x-coordinate of the Point
        this.X = X;
    }

    public void setY(double Y) {
        // Setter method to set the y-coordinate of the Point
        this.Y = Y;
    }

    public double distance(Point newPoint) {
        // Method to calculate the Euclidean distance between two points
        double D = Math.sqrt(Math.pow((newPoint.getX() - this.X), 2) + Math.pow((newPoint.getY() - this.Y), 2));
        return D;
    }

    public double norm() {
        // Method to calculate the Euclidean norm of the Point
        double N = Math.sqrt(Math.pow(this.X, 2) + Math.pow(this.Y, 2));
        return N;
    }
}
