package patterns.creational.factory_method;

public class MySqlConnection implements DataBaseConnection{
    @Override
    public void connect() {
        System.out.println( "Connected to MySQL database.");
    }
}
