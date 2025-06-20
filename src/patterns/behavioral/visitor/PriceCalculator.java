package patterns.behavioral.visitor;

public class PriceCalculator implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int price = book.getPrice();
        if (price > 100) {
            price -= 10;
        }
        System.out.println("Carte " + book.getIsbn() + ": " + price + " RON");
        return price;
    }

    @Override
    public int visit(VideoGame game) {
        int price = game.getPrice();
        System.out.println("Joc " + game.getTitle() + ": " + price + " RON");
        return price;
    }
}
