public class Main {

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        System.out.println("distance(0,0)= " + first.distance());
        Point second = new Point(3, 1);
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        Point third = new Point(3, 4);
        System.out.println("distance(3,4)= " + third.distance());
        Point fourth = new Point(4, 3);
        System.out.println("distance(4,3)= " + third.distance());
        Point fifth = new Point(-4, 3);
        System.out.println("distance(-4,3)= " + fifth.distance());
        Point sixth = new Point(9, 5);
        System.out.println("distance(9,5)= " + sixth.distance());
        Point seventh = new Point(6, 5);
        System.out.println("distance(6,5)= " + seventh.distance());
    }
}
