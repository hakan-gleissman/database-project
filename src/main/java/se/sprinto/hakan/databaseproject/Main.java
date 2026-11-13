package se.sprinto.hakan.databaseproject;

import se.sprinto.hakan.dbconnection.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    static void main() {
        try (Connection connection = DatabaseManager.getInstance().getConnection()) {
            IO.println(connection.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
