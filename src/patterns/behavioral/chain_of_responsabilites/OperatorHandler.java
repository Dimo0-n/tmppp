package patterns.behavioral.chain_of_responsabilites;

public class OperatorHandler extends SupportHandler {

    @Override
    public void handleRequest(String type) {
        if (type.equalsIgnoreCase("basic")) {
            System.out.println("Operator handled the basic request.");
        } else if (next != null) {
            next.handleRequest(type);
        } else {
            System.out.println("Request type not handled.");
        }
    }
}
