package week9;

import javax.xml.namespace.QName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.jar.Attributes;

import static java.awt.SystemColor.TEXT;

public class database {
    private String databasePath;

    database(String databasePath) throws SQLException {

        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath)) {


        }
    }
}
