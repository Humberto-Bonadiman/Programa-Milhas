package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Produto;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

@ApplicationScoped
public class ProdutoDao {

  @Inject
  EntityManager entityManager;

  /**
   * javadoc.
   */
  @SuppressWarnings("unchecked")
  public List<Produto> listar() {
    String hql = "from " + Produto.class.getSimpleName();
    Query query = entityManager.createQuery(hql);
    return query.getResultList();
  }
}
