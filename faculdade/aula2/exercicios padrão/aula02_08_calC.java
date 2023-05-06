import javax.swing.JOptionPane;

public class aula02_08_calC{
	public static void main(String[] args){
	
		double raio, resultado;	
      
         JOptionPane.showMessageDialog(null, "Calculo da área do circulo");
         
         raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio da circunferencia: "));
         
         resultado = 3.1415926535898 * (raio * raio);
         
         JOptionPane.showMessageDialog(null, "A Área da circulo é de: " + resultado);

		
		
		
	}
}