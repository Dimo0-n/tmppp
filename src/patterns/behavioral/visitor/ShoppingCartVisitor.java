package patterns.behavioral.visitor;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(VideoGame game);
}
