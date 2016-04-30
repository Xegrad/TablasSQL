package hilostablas;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {

    public void addPersona(Persona persona) {
        ConnectDB conn = new ConnectDB();
        try {
            Statement consulta = conn.getConnection().createStatement();
            String sql = "INSERT INTO Tabla1 VALUES('" + persona.Nickname + "', '" + persona.Nombre+ "', '" + persona.Edad+  "')";
            consulta.executeUpdate(sql);
            JOptionPane.showMessageDialog(null,"Persona ingresada");
            consulta.close();
            conn.desconectar();
        } catch (SQLException e) {
            System.out.println("Error al registrar "+e.getMessage());
        }
    }

    public ArrayList<Persona> getPersona() {
        ArrayList<Persona> arrP = new ArrayList<>();
        ConnectDB conn = new ConnectDB();
        String sql = "SELECT * FROM Tabla1";
        try {
            PreparedStatement ps = conn.getConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Persona user = new Persona(rs.getString("Nick"),rs.getString("Nombre"), rs.getString("Edad") );
                arrP.add(user);
            }
            rs.close();
            ps.close();
            conn.desconectar();

        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        return arrP;
    }

}