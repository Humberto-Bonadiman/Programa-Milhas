package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.TipoLancamentoDao;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DominioService {

  TipoLancamentoDao tipoLancamentoDao;

  public List<TipoLancamento> listar() {
    return tipoLancamentoDao.listar();
  }
}
