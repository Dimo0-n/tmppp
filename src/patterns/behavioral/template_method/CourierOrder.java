package patterns.behavioral.template_method;

public class CourierOrder extends OrderProcessTemplate {
    @Override
    protected void deliverProduct() {
        System.out.println("Livrare prin curier local.");
    }
}
