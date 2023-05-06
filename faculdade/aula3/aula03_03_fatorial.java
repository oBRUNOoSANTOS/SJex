import javax.swing.JOptionPane;

public class aula03_03_fatorial{
	public static void main(String[] args){
   
     do {
     
      int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        
        long fat = 1;
        
          for (int i = 1; i <= num; i++){
             
             fat = fat * i;               
             i++;
                  
           }           
           JOptionPane.showMessageDialog(null,"O fatorial de " + num + " é de " + fat);
           
         int resposta = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para fazer novamente"));    
     
     }while (resposta == 1);      
                		
 }
}