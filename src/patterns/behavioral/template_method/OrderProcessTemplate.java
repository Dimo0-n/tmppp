package patterns.behavioral.template_method;

public abstract class OrderProcessTemplate {

    public final void processOrder() {
        selectProduct();
        packProduct();
        deliverProduct();
    }

    private void selectProduct() {
        System.out.println("Produsul a fost selectat.");
    }

    private void packProduct() {
        System.out.println("Produsul a fost ambalat.");
    }

    protected abstract void deliverProduct();
}
