/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import DAO.PerfilDAO;
import com.google.gson.Gson;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import model.Usuario;

/**
 * REST Web Service
 *
 * @author Aluno
 */
@Path("softcarweb")
public class SoftcarwebResource {

    @Context
    private UriInfo context;

    public SoftcarwebResource() {
    }

    @GET
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    @Path("perfil/get")
    public String getJson() {
        try {
            PerfilDAO p = new PerfilDAO();
            
            Usuario u = p.getDados(new Usuario(2));
            
            Gson g = new Gson();
            
            return g.toJson(u);
        } catch (SQLException ex) {
            Logger.getLogger(SoftcarwebResource.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
    }
    
    @POST
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    //@Produces(MediaType.APPLICATION_XML)
    @Path("perfil")
    public String setDetails(String content) 
        {   
            System.out.println("String que veio: " + content);
            Gson g = new Gson();
                        
            Usuario u = g.fromJson(content, Usuario.class);
            
            PerfilDAO p = new PerfilDAO();
            String str = p.setDados(u);
            
            return str;
        }



    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
