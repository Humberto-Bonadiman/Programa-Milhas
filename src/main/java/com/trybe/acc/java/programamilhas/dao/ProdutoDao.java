package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Produto;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class ProdutoDao {

  @Inject
  EntityManager entityManager;

  @SuppressWarnings("unchecked")
  public List<Produto> listar() {
    return entityManager.createQuery("from Produto").getResultList();
  }
}
