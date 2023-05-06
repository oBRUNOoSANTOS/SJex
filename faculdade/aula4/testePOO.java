import javax.swing.JOptionPane;

public class testePOO{
	private int nota;
   
   
public void notaPOO(){

      if (nota >= 6){
      			
               JOptionPane.showMessageDialog(null,"Nesse trimestre, você tirou %s" + nota);
      			JOptionPane.showMessageDialog(null,"Você passou");
      			
      		}else{
            
      			JOptionPane.showMessageDialog(null,"Nesse trimestre, você tirou %s"+ nota);
      			JOptionPane.showMessageDialog(null,"Você foi reprovado");     			
		}
   }
   

public int getNota(){
   return nota;
   }
   
public int setNota(int nota){
   this.nota = nota;
   return nota;
   }
   
   
}