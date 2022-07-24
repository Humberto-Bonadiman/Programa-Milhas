package com.trybe.acc.java.programamilhas.service;

import com.trybe.acc.java.programamilhas.dao.ParceiroDao;
import com.trybe.acc.java.programamilhas.dao.ProdutoDao;
import com.trybe.acc.java.programamilhas.dao.TipoLancamentoDao;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class DominioService {

  @Inject
  TipoLancamentoDao tipoLancamentoDao;

  @Inject
  ParceiroDao parceiroDao;

  @Inject
  ProdutoDao produtoDao;

  public List<TipoLancamento> listarTipo() {
    return tipoLancamentoDao.listar();
  }

  public List<Parceiro> listarParceiro() {
    return parceiroDao.listar();
  }

  public List<Produto> listarProduto() {
    return produtoDao.listar();
  }
}
