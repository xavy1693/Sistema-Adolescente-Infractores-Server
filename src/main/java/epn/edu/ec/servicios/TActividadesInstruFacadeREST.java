/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.servicios;

import epn.edu.ec.modelos.TActividadesInstru;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author User
 */
@Stateless
@Path("epn.edu.ec.modelo.tactividadesinstru")
public class TActividadesInstruFacadeREST extends AbstractFacade<TActividadesInstru> {

    @PersistenceContext(unitName = "base_tesis")
    private EntityManager em;

    public TActividadesInstruFacadeREST() {
        super(TActividadesInstru.class);
    }
    
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_JSON})
    public TActividadesInstru crear(TActividadesInstru entidad) {
        return super.crear(entidad); //To change body of generated methods, choose Tools | Templates.
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public TActividadesInstru editar(@PathParam("id") Integer id,TActividadesInstru entidad) {
        return super.editar(entidad); //To change body of generated methods, choose Tools | Templates.
    }

    @DELETE
    @Path("{id}")
    public void eliminar(@PathParam("id") Integer id) {
        super.eliminar(super.buscarPorId(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public TActividadesInstru buscarPorObjeto(@PathParam("id") Integer id) {
        return super.buscarPorObjeto(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_JSON})
    public List<TActividadesInstru> listarTodo() {
        return super.listarTodo();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<TActividadesInstru> listarPorRango(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.listarPorRango(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String contarElementosREST() {
        return String.valueOf(super.contarElementos());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
