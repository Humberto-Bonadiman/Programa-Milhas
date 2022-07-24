package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class ParceiroDao {

  @Inject
  EntityManager entityManager;

  /**
   * javadoc.
   */
  @SuppressWarnings("unchecked")
  public List<Parceiro> listar() {
    String hql = "from " + Parceiro.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }
}
