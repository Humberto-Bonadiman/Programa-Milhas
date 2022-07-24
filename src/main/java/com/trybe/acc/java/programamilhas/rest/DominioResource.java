package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.service.DominioService;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/dominio")
public class DominioResource {

  @Inject
  DominioService dominioService;

  @GET
  @Path("/tipolancamento")
  @Produces(MediaType.APPLICATION_JSON)
  public List<TipoLancamento> listarTipo() {
    List<TipoLancamento> tipoLancamento = dominioService.listarTipo();
    return tipoLancamento;
  }

  @GET
  @Path("/parceiro")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Parceiro> listarParceiro() {
    List<Parceiro> parceiro = dominioService.listarParceiro();
    return parceiro;
  }

  @GET
  @Path("/produto")
  @Produces(MediaType.APPLICATION_JSON)
  public List<Produto> getProdutos() {
    List<Produto> produto = dominioService.listarProduto();
    return produto;
  }
}
