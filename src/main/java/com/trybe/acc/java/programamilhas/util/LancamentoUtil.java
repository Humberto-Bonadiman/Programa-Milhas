package com.trybe.acc.java.programamilhas.util;

import com.trybe.acc.java.programamilhas.model.Lancamento;
import com.trybe.acc.java.programamilhas.model.Parceiro;
import com.trybe.acc.java.programamilhas.model.Pessoa;
import com.trybe.acc.java.programamilhas.model.Produto;
import com.trybe.acc.java.programamilhas.model.TipoLancamento;
import com.trybe.acc.java.programamilhas.result.SaldoResult;

import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LancamentoUtil {

  /**
   * Método de utilidade para criar um novo lançamento.
   */
  public Lancamento criarLancamento(Integer idUsuario, Integer valor, Integer idTipoLancamento,
      Integer idParceiro, String descricao, Integer idProduto) {
    Lancamento lancamento = new Lancamento();
    Pessoa usuario = new Pessoa();
    usuario.setId(idUsuario);
    lancamento.setUsuario(usuario);
    lancamento.setDescricao(descricao);
    lancamento.setValor(valor);
    TipoLancamento tipoLancamento = new TipoLancamento();
    tipoLancamento.setId(idTipoLancamento);
    lancamento.setTipoLancamento(tipoLancamento);
    if (idParceiro != null) {
      Parceiro parceiro = new Parceiro();
      parceiro.setId(idParceiro);
      lancamento.setParceiro(parceiro);
    }
    if (idProduto != null) {
      Produto produto = new Produto();
      produto.setId(idProduto);
      lancamento.setProduto(produto);
    }
    lancamento.setData(LocalDate.now());
    return lancamento;
  }

  /**
   * CalcularSaldo.
   */
  public SaldoResult calcularSaldo(Integer id, String login, List<Lancamento> lancamentos) {
    Integer saldo = 0;

    for (Lancamento lancamento : lancamentos) {
      if (List.of(1, 3).contains(lancamento.getTipoLancamento().getId())) {
        saldo = saldo + lancamento.getValor();
      } else {
        saldo = saldo - lancamento.getValor();
      }

    }

    SaldoResult total = new SaldoResult(id, login);
    total.setSaldo(saldo);
    return total;

  }

}
