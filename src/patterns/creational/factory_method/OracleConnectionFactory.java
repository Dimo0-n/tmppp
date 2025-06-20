package patterns.creational.factory_method;

public class OracleConnectionFactory implements DataBaseConnectionFactory{
    @Override
    public DataBaseConnection getConnection() {
        return new OracleConnection();
    }
}
