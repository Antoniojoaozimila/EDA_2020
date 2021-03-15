
package AlgoritmosDePesquisa;

/**
 *
 * @author Antonio joao zimila
 */
public class PesquisaCom_While {
    
      
     static int cont=0;
       
    public static void main(String[] args){
         int[] valores =new int[]{1,3,44,5,7,87,4};
         int chave=4;
         int result=pesquisa(valores,chave);
        System.out.println(result);
    }
    
    public static int  pesquisa(int[] valores, int chave){
        
        while(chave!=valores[cont]){
           if(cont==valores.length-1){ //se ja tiver percorido todo array retorna -1
               return -1;
           }
            cont++;
        }

          return cont;
}

    
}

