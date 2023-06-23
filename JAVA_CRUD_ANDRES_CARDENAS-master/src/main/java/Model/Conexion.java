package Model;

import java.sql.Connection;

import java.sql.DriverManager;

public class Conexion {

    private static final String bbdd="jdbc:mysql://localhost:3306/redSocial";

    private static final String user="root";

    private static final String pasword="";

    private static Connection con;

    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection(bbdd, user, pasword);

            System.out.println("conexion exitosa    ");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("conexion no ha exitosa    "+e.getMessage().toString());
        }
        return con;
    }
    //pruebas
    public static void main(String[] args) {
        Conexion.conectar();
    }

}
