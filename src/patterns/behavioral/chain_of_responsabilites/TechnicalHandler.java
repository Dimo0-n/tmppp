package patterns.behavioral.chain_of_responsabilites;

public class TechnicalHandler extends SupportHandler {

    @Override
    public void handleRequest(String type) {
        if (type.equalsIgnoreCase("technical")) {
            System.out.println("IT Specialist handled the technical request.");
        } else if (next != null) {
            next.handleRequest(type);
        } else {
            System.out.println("Request type not handled.");
        }
    }
}
