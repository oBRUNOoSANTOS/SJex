import javax.swing.JOptionPane;

public class aula04_01_POO{
	public static void main(String[] args){ 
   
      testePOO testePOO = new testePOO();
      
      int nota = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));

      testePOO.setNota(nota);
      testePOO.notaPOO();     
      		
	}
}