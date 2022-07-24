package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.service.AdminService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * AdminResource.
 */
@Path("/admin")
public class AdminResource {

  @Inject
  AdminService service;

  @POST
  @Path("/saldos")
  @Produces(MediaType.APPLICATION_JSON)
  public List<SaldoResult> getSaldos(@QueryParam("token") String token) {
    return service.getSaldos();
  }
}
