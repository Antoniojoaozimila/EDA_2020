/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdenacaoObjectoPessoaSelection;

import AlgoritmosDePesquisa.PesquisaPessoa;
import java.util.ArrayList;

/**
 *
 * @author Antonio joao zimila
 */
public class Pessoa {
    
      private String nome,apelido,bi;
    private int idade;
    public Pessoa(String nome,String apelido,String bi,int idade){
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
       return "Nome:."+nome+""+"Pelido:."+apelido+""+"BI:."+bi+""+"Idade:."+idade+"\n";
   }
   
    public static void main(String[] zimila){
       ArrayList<Pessoa>  pessoas = new ArrayList<Pessoa>();
       pessoas.add(new Pessoa("Antonio","Zimila","42342345M",2));
       pessoas.add(new Pessoa("Nilza","Saite","234234333F",211));
       pessoas.add(new Pessoa("Pedro","Tivane","13342345A",44));
       pessoas.add(new Pessoa("William","Eterino","4232245P",238));
      
      selection(pessoas);
     
    }
    
   public static void selection(ArrayList<Pessoa> pessoas){
       int posMenor=0;
       int posMaior=0;
       for(int i=0;i<pessoas.size();i++){
           for(int k=i+1;k<pessoas.size();k++){
             if(pessoas.get(i).getIdade()>pessoas.get(k).getIdade()){ 
                 posMenor=k;
                 posMaior=i;
                 Pessoa aux=pessoas.get(posMaior);
                 pessoas.set(posMaior, pessoas.get(posMenor));
                 pessoas.set(posMenor,aux);
             }
           }
       }
       System.out.println(pessoas);
       
   }  
 
     
}
