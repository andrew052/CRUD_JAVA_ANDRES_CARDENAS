package Controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Publicacion.PublicacionDao;
import Model.Publicacion.PublicacionVo;



public class Publicacion extends HttpServlet{
    PublicacionDao uD=new PublicacionDao();
    PublicacionVo uV=new PublicacionVo();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       System.out.println("entro al doGet de publicacion");
       String a=req.getParameter("accion");

       switch (a) {
        case "actualizar":
        req.getRequestDispatcher("webapp/views/Instagram/Usuario/actualiIns.html").forward(req, resp);
            
            break;
        case "Actualizar":
        req.getRequestDispatcher("webapp/views/Instagram/Usuario/listaIns.html").forward(req, resp);
        break;
        case "Registrar":
        mostrar(req, resp);
        break;
       
        default:
            break;
       }

      

    }
     private void mostrar (HttpServletRequest req, HttpServletResponse resp) {
        PublicacionDao uD=new PublicacionDao();
        PublicacionVo uV=new PublicacionVo();
        try {
            List<PublicacionVo>arrayPublicacion=uD.Listar();
            req.setAttribute("publicar", arrayPublicacion);
            req.getRequestDispatcher("webapp/views/Instagram/Usuario/listaIns.html");
            System.out.println("datos vistos correctamente");
            
        } catch (Exception e) {
            System.out.println("Error al mostrar"+e.getMessage().toString());
        }

        
       }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al doGet de publicacion");
       String a=req.getParameter("accion");
       switch (a) {
        case "eliminar":
            eliminar(req,resp);
            
            break;

        case "actualizar":
        actualizar(req, resp);
            
            break;

             case "Registrar":
            
            crear(req, resp);
            break;
    
       
        default:
            break;
       }


    }

    public void eliminar(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("publi")!=null){
            uV.setIdPublicacion(Integer.parseInt(req.getParameter("publi")));
        }
        try {
            uD.eliminar(uV.getIdPublicacion());
            req.setAttribute("proceso", true);
                resp.sendRedirect("publicacion?accion=Registrar");

                
                System.out.println("Se elimino la publicacion");

        } catch (Exception e) {
            req.setAttribute("msg","No se pudo eliminar la publicacion"+e.getMessage().toString());
           System.out.println("Error al eliminar en el controlador"+e.getMessage().toString());
        }
        
    }
    
    private void crear(HttpServletRequest req, HttpServletResponse resp) {
        if(req.getParameter("nombres")!=null){
            uV.setNombreUsua(req.getParameter("nombres"));
        }
        if(req.getParameter("descripcion")!=null){
            uV.setDescripcion(req.getParameter("descripcion"));
        }

        try {
            uD.crearP(uV);
            
            System.out.println("se creo exitosamente la publicacion");
            req.getRequestDispatcher("webapp/views/Instagram/Usuario/listaIns.html");
        } catch (Exception e) {
                 System.out.println("Error al crear la publicacion"+e.getMessage().toString());
        }
    }
    private void actualizar(HttpServletRequest req, HttpServletResponse resp) {
        if (req.getParameter("idUsuario")!=null) { 
        uV.setIdPublicacion(Integer.parseInt(req.getParameter("idUsuario")));
            
        }
        if(req.getParameter("nombres")!=null){
            uV.setNombreUsua(req.getParameter("nombres"));
        }
        if(req.getParameter("descripcion")!=null){
            uV.setDescripcion(req.getParameter("descripcion"));
        }
        try {
            uD.actualizar(uV.getIdPublicacion(), uV.getNombreUsua(), uV.getDescripcion());
            resp.sendRedirect("publicacion?accion=Registrar");
                System.out.println("Informacion actualizada de la publicacion");
        } catch (Exception e) {
            req.setAttribute("msg", "No se puede actualizar el registro"+e.getMessage().toString());
            System.out.println("Error al actualizar la publicacion"+e.getMessage().toString());
        }
        
    }
}
