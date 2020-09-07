import javax.swing.*;

public class Multiplicador {
    public static void main(String args[]){
        Mult();
    }
    public static void Mult(){

        double numero1, numero2, total=0;
        String valores="";

        valores = JOptionPane.showInputDialog(null, "first number: ");
        numero1= Double.parseDouble(valores);
        valores = JOptionPane.showInputDialog(null, "second number: ");
        numero2 = Double.parseDouble(valores);
        //multiplicação dos valores abaixo
        total = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "product is: " + total);
    }
}
