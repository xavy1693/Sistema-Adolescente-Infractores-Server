/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epn.edu.ec.servicios;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author User
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(epn.edu.ec.servicios.TActividadesInstruFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TAdolescenteInfractFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TEjeEducativoFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TEjeLaboralFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TEjeSaludFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TEstadoCumpMedidaFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TIdGeograficaFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TInfoInfraccionFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TInfoJudicialFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TMedSocioeducativaFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TMedidaMasAltaFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TRepresentanteFacadeREST.class);
        resources.add(epn.edu.ec.servicios.TUnidadZonalFacadeREST.class);
    }
    
}
