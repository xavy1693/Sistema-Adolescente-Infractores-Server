/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.servicios;

import epn.edu.ec.modelos.TAdolescenteInfract;
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
@Path("epn.edu.ec.modelo.tadolescenteinfract")
public class TAdolescenteInfractFacadeREST extends AbstractFacade<TAdolescenteInfract> {

    @PersistenceContext(unitName = "base_tesis")
    private EntityManager em;

    public TAdolescenteInfractFacadeREST() {
        super(TAdolescenteInfract.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TAdolescenteInfract crear(TAdolescenteInfract entity) {
        super.crear(entity);
        return entity;
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TAdolescenteInfract editar(@PathParam("id") Integer id, TAdolescenteInfract entity) {
        super.editar(entity);
        return entity;
        
    }

    @DELETE
    @Path("{id}")
    public void eliminar(@PathParam("id") Integer id) {
        super.eliminar(super.buscarPorId(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public TAdolescenteInfract find(@PathParam("id") Integer id) {
        return super.buscarPorId(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<TAdolescenteInfract> listarTodo() {
        return super.listarTodo();
    }


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
