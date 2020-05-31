package module1.cycles;

public class Area {

    public static void main(String[] args) {
        double from = 0;
        double to = Math.PI;
        double dx = 0.01;

        double y = 0.1 * 3;

        double area = 0;
        for (double x = from; x < to; x += dx) {
            double rectangle;
            if (Math.sin(x) < y) {
                rectangle = Math.sin(x) * dx;
            } else {
                rectangle = y * dx;
            }
            area += rectangle;
        }
        System.out.println("Area is " + area);
    }
}
