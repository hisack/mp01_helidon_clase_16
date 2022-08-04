package com.programacion;


import com.programacion.servicios.HolaMundo;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.LocalDateTime;

@Path(value="/")
public class HolaMundoRest {

    @Inject
    private HolaMundo servicio;

    @GET
    @Path("/hola")
    public String hola(){

      // return "hola "+ LocalDateTime.now();
        String ret = servicio.hola();

       return ret;
    }




}
