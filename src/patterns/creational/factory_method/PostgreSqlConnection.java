package patterns.creational.factory_method;

public class PostgreSqlConnection implements DataBaseConnection{
    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }
}
