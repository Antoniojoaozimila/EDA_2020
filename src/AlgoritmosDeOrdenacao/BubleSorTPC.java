
package AlgoritmosDeOrdenacao;

/**
 *
 * @author Antonio joao zimila
 */
public class BubleSorTPC {
    
    public static void main(String[] zimila){
        
        int[]valores = new int[]{2,1,34,5,12,10,4,7};
        int valor1=0;
        int valor2=0;
      
        for(int last=valores.length-1;last>0;last--){
            for(int i=0;i<valores.length-1;i++){
               if(valores[i]>valores[i+1]){
                   valor1=valores[i+1];
                   valores[i+1]=valores[i];
                   valores[i]=valor1;
                   
               } 
            }
        }
          for(int listar : valores){
            System.out.println(listar);
            
        }    
    }
    
}
