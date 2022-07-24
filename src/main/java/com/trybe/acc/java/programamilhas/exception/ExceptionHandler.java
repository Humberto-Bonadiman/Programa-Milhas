package com.trybe.acc.java.programamilhas.exception;

import com.trybe.acc.java.programamilhas.result.MensagemResult;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class ExceptionHandler implements ExceptionMapper<Exception> {

  @Override
  public Response toResponse(Exception exception) {
    MensagemResult mensagem = new MensagemResult(exception.getMessage());
    return Response.status(500).entity(mensagem).build();
  }
}
