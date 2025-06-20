package patterns.creational.factory_method;

public class PostgreSqlConnectionFactory implements DataBaseConnectionFactory{
    @Override
    public DataBaseConnection getConnection() {
        return new PostgreSqlConnection();
    }
}
