/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDePesquisa;

import java.util.ArrayList;

/**
 *
 * @author Antonio joao zimila
 */
public class PesquisaPessoa {
    private String nome,apelido,bi;
    private int idade;
    public PesquisaPessoa(String nome,String apelido,String bi,int idade){
       this.nome=nome;
       this.apelido=apelido;
       this.bi=bi;
       this.idade=idade;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public String getApelido() {
        return apelido;
    }

    
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    
    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public int getIdade() {
        return idade;
    }

    
    public void setIdade(int idade) {
        this.idade = idade;
    }
   public String toString(){
       return "Nome:."+nome+"\n"+"Pelido:."+apelido+"\n"+"BI:."+bi+"\n"+"Idade:."+idade;
   }
   
    public static void main(String[] zimila){
       ArrayList<PesquisaPessoa>  pessoas = new ArrayList<PesquisaPessoa>();
       pessoas.add(new PesquisaPessoa("Antonio","Zimila","42342345M",12));
       pessoas.add(new PesquisaPessoa("Nilza","Saite","234234333F",13));
       pessoas.add(new PesquisaPessoa("Pedro","Tivane","13342345A",22));
       pessoas.add(new PesquisaPessoa("William","Eterino","4232245P",12));
       String chave="13342345A";
       
       Object result =pesquisa(pessoas,chave);
       System.out.println(result);
    }
    
    public static Object pesquisa( ArrayList<PesquisaPessoa> pessoas,String  chave){
        
        for(PesquisaPessoa item : pessoas){
            if(item.getBi()==chave){
              return item;  
        }
    }
        
   return null; 
}
}