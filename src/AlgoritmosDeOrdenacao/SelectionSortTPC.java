
package AlgoritmosDeOrdenacao;

/**
 *
 * @author Antonio joao zimila
 */
public class SelectionSortTPC {
    
    public static void main(String[] zimila){
        
        int[]valores = new int[]{2,3,34,5,12,10,4,7};
        int Pmenor=0;
        int valorMenor=0;
        
        
        for(int i=0;i<valores.length;i++){
            Pmenor=i;
         for(int k=i+1; k<valores.length;k++){
            if(valores[i]>valores[k]){
               Pmenor=k;   
            } 
         }
       valorMenor=valores[Pmenor];
       valores[Pmenor]=valores[i]; 
       valores[i]=valorMenor;
        }
        
        for(int listar : valores){
            System.out.println(listar);
            
        }    
    }
    
}
