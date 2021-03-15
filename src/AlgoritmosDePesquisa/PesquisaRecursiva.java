
package AlgoritmosDePesquisa;

import static AlgoritmosDePesquisa.Pesquisa_DoWhile.pesquisa;

/**
 *
 * @author Antonio joao zimila
 */
public class PesquisaRecursiva {
    static int cont=0;
    public static void main(String[] zimila){
         int[] valores =new int[]{1,3,44,5,7,87,4};
         int chave=90;
         int result=pesquisa(valores,chave);
        System.out.println(result);
        
    }
    
    public static int pesquisa(int[] valores,int chave){
        if(chave==valores[cont]){
            return cont;
        }else if(chave!=valores[cont]&&cont==valores.length-1){
           return -1; 
        }
        cont++;
    return pesquisa(valores,chave);    
    }
    
}
