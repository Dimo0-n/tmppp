package patterns.behavioral.chain_of_responsabilites;

public class Main {
    public static void main(String[] args) {
        SupportHandler operatorHandler = new OperatorHandler();
        SupportHandler technicalHandler = new TechnicalHandler();
        SupportHandler managerHandler = new ManagerHandler();

        operatorHandler.setNext(technicalHandler);
        technicalHandler.setNext(managerHandler);

        operatorHandler.handleRequest("basic");
        operatorHandler.handleRequest("administrative");
        operatorHandler.handleRequest("technical");
        operatorHandler.handleRequest("non-existing");

    }
}
