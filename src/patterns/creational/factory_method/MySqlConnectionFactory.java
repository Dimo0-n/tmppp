package patterns.creational.factory_method;

public class MySqlConnectionFactory implements DataBaseConnectionFactory{
    @Override
    public DataBaseConnection getConnection() {
        return new MySqlConnection();
    }
}
