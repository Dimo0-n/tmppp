package patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {

        Circle originalCircle = new Circle(10);
        Circle cloneCircle = (Circle) originalCircle.clone();
        cloneCircle.setRadius(20);

        System.out.println(originalCircle);
        System.out.println(cloneCircle);

        Square originalSquare = new Square(10);
        Square cloneSquare = (Square) originalSquare.clone();
        cloneSquare.setSide(20);

        System.out.println(originalSquare);
        System.out.println(cloneSquare);

    }
}
