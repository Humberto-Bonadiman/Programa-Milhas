package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Parceiro;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class ParceiroDao {

  @Inject
  EntityManager entityManager;

  @SuppressWarnings("unchecked")
  public List<Parceiro> listar() {
    return entityManager.createQuery("from Parceiro").getResultList();
  }
}
