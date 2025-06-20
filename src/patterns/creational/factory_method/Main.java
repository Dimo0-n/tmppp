package patterns.creational.factory_method;

import java.util.Scanner;

public abstract class Main implements DataBaseConnectionFactory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dataDaseType = scanner.nextLine();

        DataBaseConnectionFactory factory = null;

        switch (dataDaseType) {
            case "mysql":
                factory = new MySqlConnectionFactory();
                break;
            case "oracle":
                factory = new OracleConnectionFactory();
                break;
            case "postgresql":
                factory = new PostgreSqlConnectionFactory();
                break;
            default:
                throw new IllegalArgumentException("Invalid data base type");
        }

        DataBaseConnection connection = factory.getConnection();
        connection.connect();
    }
}
