package cz.gyarab.prg3.s1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NaplnDB {
    public static void main(String[] args) throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:data2.db")) {
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(
                        "CREATE TABLE kniha (kniha_id INT PRIMARY KEY, jmeno VARCHAR NOT NULL UNIQUE, autor_id INT NOT NULL)");
            }

        }
    }
}
