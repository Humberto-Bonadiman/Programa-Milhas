package com.trybe.acc.java.programamilhas.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * echo resource.
 *
 */
@Path("/echo")
@Produces(MediaType.TEXT_PLAIN)
@ApplicationScoped
public class EchoResource {

  @GET
  public String ola() {
    return "Olá!";
  }
}
