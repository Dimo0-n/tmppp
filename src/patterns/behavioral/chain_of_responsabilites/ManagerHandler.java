package patterns.behavioral.chain_of_responsabilites;

public class ManagerHandler extends SupportHandler {

    @Override
    public void handleRequest(String type) {
        if (type.equalsIgnoreCase("administrative")) {
            System.out.println("Manager handled the administrative request.");
        } else if (next != null) {
            next.handleRequest(type);
        } else {
            System.out.println("Request type not handled.");
        }
    }
}
