package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class LancamentoDao {

  @Inject
  EntityManager entityManager;

  @SuppressWarnings("unchecked")
  public List<Lancamento> listar() {
    return entityManager.createQuery("from Lancamento").getResultList();
  }
}
