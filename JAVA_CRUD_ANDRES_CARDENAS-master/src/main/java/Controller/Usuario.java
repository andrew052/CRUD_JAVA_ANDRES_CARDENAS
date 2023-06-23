package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Usuario.UsuarioDao;
import Model.Usuario.UsuarioVo;

public class Usuario extends HttpServlet {
    UsuarioDao uD=new UsuarioDao();
    UsuarioVo uV=new UsuarioVo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al doget");
        String a=req.getParameter("accion");

        switch (a) {
            case "regisFace":
            req.getRequestDispatcher("webapp/views/Facebook/Usuario/regisFace.jsp").forward(req, resp);
                
                break;
                case "regisInsta":
            req.getRequestDispatcher("webapp/views/Facebook/Usuario/regisIns.jsp").forward(req, resp);
                
                break;

            case "verList":
            req.getRequestDispatcher("../webapp/views/Instagram/Usuario/listaIns.html").forward(req, resp);
            break;
            default:
                
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        System.out.println("error en el doPost de usuario");
       String a=req.getParameter("accion");
       switch (a) {
        case "Registrar":
        if (req.getParameter("contrasena")!=null){
            uV.setContrasena(req.getParameter("contrasena"));   
        } 
        if (req.getParameter("nombreUsua")!=null) {
            uV.setNombreUsua(req.getParameter("nombreUsua"));  
        }
        if (req.getParameter("correo")!=null) {
            uV.setCorreo(req.getParameter("correo"));
        }
        else {
            
        }   
        try {
            uD.crearU(uV);
                System.out.println("Se registro correctamente el usuario");
                req.getRequestDispatcher("webapp/views/Instagram/Usuario/listaIns.html").forward(req, resp);
        } catch (Exception e) {
            System.out.println("Error al registrar usuario" +e.getMessage().toString());
        }       
            break;
       
        default:
            break;
       } 
    }
    
    
}
