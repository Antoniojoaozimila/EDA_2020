
package AlgoritmosDePesquisa;

import static AlgoritmosDePesquisa.PesquisaCom_While.pesquisa;

/**
 *
 * @author Antonio joao zimila
 */
public class Pesquisa_DoWhile {
    static int cont=0;
    public static void main(String[] args){
         int[] valores =new int[]{1,3,44,5,7,87,4};
         int chave=4;
         int result=pesquisa(valores,chave);
        System.out.println(result);
    }
    
    public static int pesquisa(int[] valores,int chave){
     
        do{
            
           if(cont==valores.length-1){
              return -1; 
           } 
           
          if(valores[0]==chave){
             return 0; 
          }
          cont++;
           
        }while(chave!=valores[cont]);
        
       return cont; 
    }
    
}
