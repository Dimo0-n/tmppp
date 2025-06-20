package patterns.behavioral.visitor;

public class VideoGame implements ItemElement {
    private int price;
    private String title;

    public VideoGame(int price, String title) {
        this.price = price;
        this.title = title;
    }

    public int getPrice() { return price; }
    public String getTitle() { return title; }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
