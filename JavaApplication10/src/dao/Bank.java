package dao;
import java.util.ArrayList;
import java.util.HashMap;

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
       
      //Limpar os dados//
      nome = "";
      email = "";
      senha = "";
      cre = 0;
      
      //---------------//
 
   }

}
