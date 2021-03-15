/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PesquisaBinaria;

/**
 *
 * @author Antonio joao zimila
 */
public class Search {
    
    public static void main(String[] args){
        int [] valores = new int[]{1,2,3,4,5,6,7,8,9};
        int inicio=0;
        int fim=valores.length;
        int chave=1;
        
       System.out.println(pesquisaBinaria(valores,inicio,fim,chave));
    }
    
    public static int pesquisaBinaria(int[] valores,int inicio1,int fim1,int chave1){
        int inicio,fim,chave;
        int meio=0;
        inicio=inicio1;
        fim=fim1;
        chave=chave1;
        
        
        
      
       while(fim>=inicio){
         meio=(inicio+fim)/2;
         if(chave==valores[meio]){
             return meio;
         }else if(chave>valores[meio]){
             inicio=meio+1;
         }else if(chave<valores[meio]){
             fim=meio-1;
         }
         }
       return -1;
}
    }