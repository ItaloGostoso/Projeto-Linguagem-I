package cantina;

import java.util.ArrayList;

import interfaceModels.IGerenciador;
import modelTipoPagamento.Dinheiro;
import modelTipoPagamento.Cartao;
import modelTipoPagamento.Pix;
import models.TipoPagamento;

public class GerenciadorTipoPagamento extends TipoPagamento implements IGerenciador {
  
  ArrayList<TipoPagamento> listTipoPagamento;


    public GerenciadorTipoPagamento(String dataVencimento, Double valor) {
        super(dataVencimento, valor);
    }

    public GerenciadorTipoPagamento(){
      this.listTipoPagamento = new ArrayList<>();
    }
    
    public void adicionandoTipo(Dinheiro dinheiro) {
      adicionar(dinheiro);
    }
    public void adicionandoTipo(Cartao cartao) {
      adicionar(cartao);
    }
    public void adicionandoTipo(Pix pix) {
      adicionar(pix);
    }

    
    public void listar() {
      for (TipoPagamento tipoPagamento : listTipoPagamento) {
          System.out.println("\n-----------\n"+tipoPagamento.toString());
      }
    }

    public void adicionar(TipoPagamento tipoPagamento) {
      if(listTipoPagamento.size() > 0) {
        System.out.println("Você só pode ter um tipo de pagamento.");
      }
      else {        
        listTipoPagamento.add(tipoPagamento);
      }

    }

  
    public void editar(String tipoPagamento) {
      

    }

    
    public void apagar(String tipoPagamento) {
      
      for (int i = 0; i < listTipoPagamento.size(); i++) {
      
        if(listTipoPagamento.equals(null)) {
          System.out.println("Você não tem nenhuma forma de pagamento '-'");
        }
        else {
          listTipoPagamento.remove(i);
        }
    }
      

    }
}
