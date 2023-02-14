package cz.gyarab.prg3.s1;

import java.sql.*;

public class Kniha {
    int knihaId;
    String jmeno;
    int autorId;

    public Kniha(int knihaId, String jmeno, int autorId) {
        this.knihaId = knihaId;
        this.jmeno = jmeno;
        this.autorId = autorId;
    }

    @Override
    public String toString() {
        return "Kniha{" +
                "knihaId=" + knihaId +
                ", jmeno='" + jmeno + '\'' +
                ", autorId=" + autorId +
                '}';
    }

    public void writeToDB(Connection conn) throws SQLException {
        String sql = "INSERT INTO kniha VALUES(?,?,?)";
        PreparedStatement uloz = conn.prepareStatement(sql);

        uloz.setInt(1, knihaId);
        uloz.setString(2, jmeno);
        uloz.setInt(3, autorId);

        uloz.executeUpdate();
    }

    static public Kniha readFromDB(int id) {
        rs;

        return new Kniha(id, ..., ...);
    }


    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:data.db")) {
            Kniha k2 = new Kniha(1, "dasenka", 5);
            k2.writeToDB(conn);

            Kniha k = readFromDB(5);

            System.out.println(k);
            /* kód používající conn */
        }

    }
}
