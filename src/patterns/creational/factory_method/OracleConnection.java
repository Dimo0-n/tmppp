package patterns.creational.factory_method;

public class OracleConnection implements DataBaseConnection{
    @Override
    public void connect() {
        System.out.println( "Connected to Oracle database.");
    }
}
