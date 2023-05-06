import javax.swing.JOptionPane;

public class ExAll{


	public ex03(){
	
   		int num, resultado;
         
         num =Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));	
         
         resultado = num % 2;
         
         if (resultado == 1){
         
            JOptionPane.showMessageDialog(null, "O seu numero é impar");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "O seu numero é par");
         }
     		
	}
}