package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.dto.LoginDto;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.util.HashUtil;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * Pessoa service.
 */
@ApplicationScoped
public class PessoaService {

  @Inject
  PessoaDao pessoaDao;

  @Inject
  HashUtil hashUtil;

  /**
   * Salvar.
   */
  public void salvar(LoginDto loginDto) throws InvalidKeySpecException, NoSuchAlgorithmException {
    Pessoa pessoa = new Pessoa();

    pessoa.setLogin(loginDto.getLogin());
    pessoa.setHash(hashUtil.hash(loginDto.getSenha()));

    pessoaDao.create(pessoa);
  }
}
