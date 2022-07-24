package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class TipoLancamentoDao {

  @Inject
  EntityManager entityManager;

  /**
   * comentário.
   */
  @SuppressWarnings("unchecked")
  public List<TipoLancamento> listar() {
    String hql = "from " + TipoLancamento.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }

}
