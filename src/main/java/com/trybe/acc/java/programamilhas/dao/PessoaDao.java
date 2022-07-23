package com.trybe.acc.java.programamilhas.dao;

import com.trybe.acc.java.programamilhas.model.Pessoa;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

@ApplicationScoped
public class PessoaDao {

  @Inject
  EntityManager entityManager;

  /**
   * Método responsável pela realização do login.
   *
   * <p>
   * Não delete este método!
   * </p>
   */
  public Pessoa autenticar(String login, String hash) {
    String hql = "from " + Pessoa.class.getSimpleName() + " where login = :login and hash = :hash";
    Query query = entityManager.createQuery(hql);
    query.setParameter("login", login);
    query.setParameter("hash", hash);
    return (Pessoa) query.getSingleResult();
  }

  @Transactional
  public void create(Pessoa pessoa) {
    entityManager.persist(pessoa);
  }

  @SuppressWarnings("unchecked")
  public List<Pessoa> listar() {
    return entityManager.createQuery("from Pessoa").getResultList();
  }
}
