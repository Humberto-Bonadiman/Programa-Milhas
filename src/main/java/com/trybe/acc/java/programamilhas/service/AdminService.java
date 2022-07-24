package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.PessoaDao;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.result.SaldoResult;
import com.trybe.acc.java.programamilhas.util.LancamentoUtil;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * AdminService.
 */
@ApplicationScoped
public class AdminService {

  @Inject
  PessoaDao pessoaDao;

  @Inject
  LancamentoUtil lancamentoUtil;

  /**
   * GetSaldos.
   */
  public List<SaldoResult> getSaldos() {
    List<Pessoa> usuarios = pessoaDao.listar();
    List<SaldoResult> saldos = new ArrayList<SaldoResult>();

    for (Pessoa pessoa : usuarios) {
      saldos.add(new SaldoResult(pessoa.getId(), pessoa.getLogin()));
    }
    return saldos;
  }
}
