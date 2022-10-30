package JBank;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import view.FuncionáriosTabela;

public class Bank {
   HashMap Map = new HashMap();// Conjunto em que cada elemento possui uma Key(chave)
   int i = 0;
   
   public void Conta(){
       this.i++;
   }
   
   public void Guardar(String nome, String email, String senha, int cre){
       ArrayList book = new ArrayList();
       
       // Adicionando os valores numa "Caixa"
       book.add(nome);
       book.add(email);
       book.add(senha);
       book.add(cre);
       
       //Colocando uma ID nessas "Caixas" e separando elas
       Map.put(i, book);
       
       System.out.println(Map);
       
       ArrayList N1 = (ArrayList) Map.get(i);
       System.out.println("Novo Usuario | "+"Email: " + N1.get(1) +" Senha: "+ N1.get(2));
       
      //Limpar os dados//
      nome = "";
      email = "";
      senha = "";
      cre = 0;
      
      //---------------//
 
   }
   
      public void Logar(String email, String senha){
       for(int c = 0; c <= 4; c++){
           ArrayList N1 = (ArrayList) Map.get(i + 1);
           System.out.println(N1.get(i));
           
           if(email == N1.get(1) && senha == N1.get(2)){
               FuncionáriosTabela FT = new FuncionáriosTabela();
               FT.setVisible(true);
           }
           
       }
   }
      

}
