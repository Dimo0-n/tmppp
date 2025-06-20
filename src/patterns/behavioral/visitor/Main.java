package patterns.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
            new Book(120, "ISBN-001"),
            new Book(80, "ISBN-002"),
            new VideoGame(200, "GTA VI")
        };

        int total = 0;
        ShoppingCartVisitor visitor = new PriceCalculator();

        for (ItemElement item : items) {
            total += item.accept(visitor);
        }

        System.out.println("Total final: " + total + " RON");
    }
}
