package cz.gyarab.prg3.s2;

import java.sql.*;
import java.util.Scanner;

public class CtiZDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jmeno: ");
        String jmeno = sc.nextLine();
        jmeno = jmeno.replaceAll("'", "''");

        System.out.print("Prijmeni: ");
        String primeni = sc.nextLine().replaceAll("'", "''");

        System.out.print("Vek: ");
        int vek = sc.nextInt();
        if (vek > 100) {
            System.out.println("to nejde");
            return;
        }

        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:z:/test.db")) {
            try (Statement stmt = conn.createStatement()) {
                stmt.executeUpdate("CREATE TABLE IF NOT EXISTS clovek2 (jmeno VARCHAR, prijmeni VARCHAR, vek INT);");

                String sql = "INSERT INTO clovek2 VALUES ('" + jmeno + "', '" + primeni + "', " + vek + ");";
                System.out.println(sql);
                stmt.executeUpdate(sql);

                ResultSet rs = stmt.executeQuery("SELECT jmeno, prijmeni, vek FROM clovek2");
                while(rs.next()) {
                    String j = rs.getString(1);
                    String p = rs.getString(2);
                    int v = rs.getInt(3);

                    System.out.println(j + " " + p + " " + v);
                }

            }
        } catch (SQLException e) {
            System.out.println("schyba" + e);
        }

        /*
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:z:/test.db");
        } catch (SQLException ex) {
            System.out.println("chyba spojeni:");
            return;
        }

        try {
            Statement stmt = conn.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS clovek2 (jmeno VARCHAR, prijmeni VARCHAR, vek INT);");

            String sql = "INSERT INTO clovek2 VALUES ('" + jmeno + "', '" + primeni + "', " + vek + ");";
            System.out.println(sql);
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("chyba");
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("chyba ^ 2");
            }
        }

         */

    }
}
