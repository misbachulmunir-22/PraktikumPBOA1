/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistanceobject;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDAO untuk MYySQL
 * @author Misbachul Munir 24060124120031
 */
import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {

    public void savePerson(Person person) throws Exception {
        String name = person.getName();

//        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/pbo",
            "root",
            "Bismillahcumlaude3,5"
        );

        String query = "INSERT INTO person(name) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);

        ps.executeUpdate();

        ps.close();
        con.close();

        System.out.println("Data berhasil disimpan: " + name);
    }
}
