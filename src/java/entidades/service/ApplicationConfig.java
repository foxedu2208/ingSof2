/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Acer
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
        resources.add(entidades.service.HijosFacadeREST.class);
        resources.add(entidades.service.LibretaFacadeREST.class);
        resources.add(entidades.service.MadreinfoFacadeREST.class);
        resources.add(entidades.service.PadreinfoFacadeREST.class);
        resources.add(entidades.service.TutorinfoFacadeREST.class);
        resources.add(entidades.service.UbicacionFacadeREST.class);
        resources.add(entidades.service.UsuariosFacadeREST.class);
        resources.add(entidades.service.VacunasFacadeREST.class);
        resources.add(entidades.service.VacunasinfoFacadeREST.class);
    }
    
}
