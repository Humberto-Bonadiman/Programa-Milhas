package com.trybe.acc.java.programamilhas.dao;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class LancamentoDao {

  @Inject
  EntityManager entityManager;
}
