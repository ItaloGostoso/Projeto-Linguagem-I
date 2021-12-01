package cantina; 
public class Servidor extends Cliente { 
private int CPF; private String setor; } 
public int getCPF() 
{ 
return cpf; 
} 
public void setMatricula(int matricula)
 { 
this.matricula = matricula;
 } 
public int getSetor()
 { 
return setor; 
} 
public void setSetor(String setor)
 { 
this.setor = setor;
 } 
public void fiado() { 
System.out.println("Transferindo valor para o crédito de" +this.nome); }
