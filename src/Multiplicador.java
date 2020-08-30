import javax.swing.*;

public class Multiplicador {
    public static void main(String args[]){
        Mult();
    }
    public static void Mult(){
        // declaração de variaveis para não ter problema com as memoria
        double n1, n2, total=0;
        String system_input="";

        system_input = JOptionPane.showInputDialog(null, "first number: ");
        n1= Double.parseDouble(system_input);
        system_input = JOptionPane.showInputDialog(null, "second number: ");
        n2 = Double.parseDouble(system_input);

        //multiplicação dos valores
        total = n1 * n2;
        JOptionPane.showMessageDialog(null, "product is: " + total);
    }
}
