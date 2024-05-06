package week9;

import javax.management.monitor.StringMonitor;
import java.sql.SQLException;

public class movieslist {
    private static final String DB_Path = "sqlite";
    private static database database;

    public static void main(String[] args) throws SQLException {
        database = new database(DB_Path);

    }
}

