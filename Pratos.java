import java.util.ArrayList;


public class pratos
 {
   private String nome;
   private int codigo;
   }
   
   public String getNome() {
     return nome;
   }
   
   public void setNome(String nome) {
     this.nome = nome;
   }
   
   public int getCodigo() {
     return codigo;
   }
   public void setCodigo(int codigo) {
     this.codigo = codigo;
  }
   
    List<Pratos> prato = new ArrayList<>();
     
     for (int i < 5) {
       Pratos almoço = new Pratos("Dia da semana:" + i, "Almoço do dia:" + i);
       prato.add(almoço);
       i++;
       
     }
     
    System.out.println(prato.get(5).getDiaSemana());
    System.out.println(prato.get(5)get.Almoco());
    
   }
 }

