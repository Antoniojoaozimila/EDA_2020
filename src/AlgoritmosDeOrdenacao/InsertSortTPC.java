
package AlgoritmosDeOrdenacao;

/**
 *
 * @author Antonio joao zimila
 */
public class InsertSortTPC {
    
    public static void main(String[] zimila){
        
        int[]valores = new int[]{2,1,34,5,12,10,4,7};
        int valor1=0;
        int valor2=0;
        int j=0;
       
      
      for(int i=1; i<valores.length;i++){  
       valor1=valores[i];  
       j=i-1;
       while(j>=0&&valor1<valores[j]){
          valores[j+1]=valores[j];
           j--;
       }
       valores[j+1]=valor1;
      
      }
      
          for(int listar : valores){
            System.out.println(listar);
            
        }    
    }
    
}
