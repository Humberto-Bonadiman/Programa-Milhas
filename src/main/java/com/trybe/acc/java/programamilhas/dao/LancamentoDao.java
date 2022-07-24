package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class LancamentoDao {

  @Inject
  EntityManager entityManager;

  /**
   * javadoc.
   */
  @SuppressWarnings("unchecked")
  public List<Lancamento> listar() {
    String hql = "from " + Lancamento.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }
}
