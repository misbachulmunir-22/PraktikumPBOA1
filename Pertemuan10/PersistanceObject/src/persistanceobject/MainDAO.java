/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistanceobject;

/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * @author Misbachul Munir 24060124120031
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Mamat");

        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());

        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
