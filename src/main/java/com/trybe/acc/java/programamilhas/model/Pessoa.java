package com.trybe.acc.java.programamilhas.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pessoa {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "idPessoa")
  private Integer id;

  private String login;

  private String hash;

  @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private List<Lancamento> lancamentos = new ArrayList<Lancamento>();

  public List<Lancamento> getLancamentos() {
    return lancamentos;
  }

  public void setLancamentos(List<Lancamento> lancamentos) {
    this.lancamentos = lancamentos;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer idUsuario) {
    this.id = idUsuario;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

}
