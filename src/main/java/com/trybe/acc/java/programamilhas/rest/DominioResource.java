package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.service.DominioService;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dominio")
@ApplicationScoped
public class DominioResource {

  DominioService dominioService;

  @GET
  @Path("/tipolancamento")
  @Produces(MediaType.TEXT_PLAIN)
  public List<TipoLancamento> listar() {
    List<TipoLancamento> tipoLancamento = dominioService.listar();
    return tipoLancamento;
  }
}
