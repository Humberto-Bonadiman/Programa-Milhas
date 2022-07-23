package com.trybe.acc.java.programamilhas.rest;

import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.result.MensagemResult;
import com.trybe.acc.java.programamilhas.service.PessoaService;
import com.trybe.acc.java.programamilhas.util.TokenUtil;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * pessoa resource.
 *
 */
@Path("/pessoa")
@Produces(MediaType.TEXT_PLAIN)
@ApplicationScoped
public class PessoaResource {

  @Inject
  PessoaService service;

  @Inject
  TokenUtil tokenUtil;

  /**
   * Salvar.
   */
  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public MensagemResult salvar(LoginDto pessoa)
      throws InvalidKeySpecException, NoSuchAlgorithmException {
    service.salvar(pessoa);

    return new MensagemResult("Usuário criado");
  }
}
