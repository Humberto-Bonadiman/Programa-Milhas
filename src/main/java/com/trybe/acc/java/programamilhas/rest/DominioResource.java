package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.service.DominioService;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dominio")
@ApplicationScoped
public class DominioResource {

  @Inject
  DominioService dominioService;

  @GET
  @Path("/tipolancamento")
  @Produces(MediaType.TEXT_PLAIN)
  public List<TipoLancamento> listarTipo() {
    List<TipoLancamento> tipoLancamento = dominioService.listarTipo();
    return tipoLancamento;
  }

  @GET
  @Path("/parceiro")
  @Produces(MediaType.TEXT_PLAIN)
  public List<Parceiro> listarParceiro() {
    return dominioService.listarParceiro();
  }

  @GET
  @Path("/produto")
  @Produces(MediaType.TEXT_PLAIN)
  public List<Produto> listarProduto() {
    return dominioService.listarProduto();
  }
}
