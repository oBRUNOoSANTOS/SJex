import java.util.Scanner;
import javax.swing.JOptionPane;

public class ajuda {
    public static void main(String[] args) {
        
        //Scanner ler = new Scanner(System.in);
        
        int num1;
        int num2;
        
       /* System.out.print("Informe um numero: ");
        num1 = ler.nextInt();
        
        System.out.print("Informe outro numero: ");
        num2 = ler.nextInt();
        
        int x = num1+num2;
        
        System.out.print("X = " + x );*/
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro numero: "));
        
        int x = num1+num2;
        
        JOptionPane.showMessageDialog(null,"X = " + x);
        
    }
}