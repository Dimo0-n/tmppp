package patterns.behavioral.template_method;

public class AirOrder extends OrderProcessTemplate {
    @Override
    protected void deliverProduct() {
        System.out.println("Livrare prin transport aerian VIP.");
    }
}
