package Model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import Model.Conexion;

public class UsuarioDao {
    Connection bas;
    PreparedStatement bs;
    ResultSet jan;
    String sql=null;
    int x;
    public int crearU (UsuarioVo crear) throws SQLException{ 
        sql="insert into usuarios (idUsuario, contrasena, nombreUsua, correo) values(null, ?, ?, ?)";
        try {
            bas=Conexion.conectar();
            bs=bas.prepareStatement(sql);
            bs.setString(1, crear.getContrasena());
            bs.setString(2, crear.getNombreUsua());
            bs.setString(3, crear.getCorreo());
            System.out.println("Funcionamiento correcto en el dao de Usuario");
        } catch (Exception e) {
            System.out.println("Error en el Dao de Usuario" + e.getMessage().toString());

            
        }
        finally{bas.close();}
        return x;

    } 
    
    public void Eliminar(int idPublicacion) {

        
    }

}
