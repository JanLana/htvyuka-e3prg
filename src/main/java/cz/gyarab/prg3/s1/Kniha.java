package cz.gyarab.prg3.s1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

    static public Kniha readFromDB(int id) {
       //...
        return null;
    }

    public void writeToDB() throws SQLException {
        try(Connection conn = DriverManager.getConnection("jdbc:sqlite:data2.db")) {
            PreparedStatement uloz = conn.prepareStatement("INSERT INTO kniha VALUES (?,?,?)");
            uloz.setInt(1, knihaId);
            uloz.setString(2, jmeno);
            uloz.setInt(3, autorId);
            uloz.executeUpdate();
        }
    }

    public static void main(String[] args) throws SQLException {
        //Kniha k = new Kniha(1, "maj", 3);
        //k.writeToDB();

        Kniha k2 = readFromDB(1);
        System.out.println(k2);
    }



}
