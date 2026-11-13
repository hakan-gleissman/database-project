package se.sprinto.hakan.databaseproject;

import org.junit.jupiter.api.Test;
import se.sprinto.hakan.dbconnection.DatabaseManager;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseManagerTest {
    @Test
    void testH2Connection() {
        try (Connection connection = DatabaseManager.getInstance().getConnection()) {
            assertNotNull(connection);
            assertEquals("H2", connection.getMetaData().getDatabaseProductName());
        } catch (SQLException e) {
            fail("Vi borde få en connection till databasen");
        }
    }

}
