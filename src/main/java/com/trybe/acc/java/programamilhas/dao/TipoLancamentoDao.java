package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class TipoLancamentoDao {

  @Inject
  EntityManager entityManager;

  /**
   * comentário.
   */
  @SuppressWarnings("unchecked")
  public List<TipoLancamento> listar() {
    return entityManager.createQuery("from TipoLancamento").getResultList();
  }

}
