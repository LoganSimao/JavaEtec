import javax.swing.*;


public class imc {
    public static void main(String args[]){
        imc();
    }
    public static void closing(){
        int  sim = 0;
        String valor = "";
        valor = JOptionPane.showInputDialog(null, "1 - continuar\n2 - sair ", "Calculo do IMC", 1);
        sim = Integer.parseInt(valor);
        if (sim == 1) {
            imc();
        }
        else{
            System.exit(0);
        }
    }
    public static void imc(){
        double peso, altura, total= 0;
        int imc = 0, imc2 = 0;
        String inp = "";
        try {
            inp = JOptionPane.showInputDialog(null, "Insira o peso(em kilogramas)", "Calculo do IMC", 1);
            inp = inp.replace(',', '.');
            peso = Double.parseDouble(inp);
            if (peso < 0.5) {
                JOptionPane.showMessageDialog(null, "peso invalido!", "Calculo do IMC", 1);
                imc();
            }
            inp = JOptionPane.showInputDialog(null, "Insira a altura(em metros)", "Calculo do IMC", 1);
            inp = inp.replace(',', '.');
            altura = Double.parseDouble(inp);
            if (altura < 0.1) {
                JOptionPane.showMessageDialog(null, "altura invalida!", "Calculo do IMC", 1);
                imc();
            }
            total = peso / Math.pow(altura, 2);
            imc = (int) total;

            if (total < 18.5) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", Excesso de magreza!", "Calculo do IMC", 1);
            } else if (total > 18.5 && total < 25) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", peso normal!", "Calculo do IMC", 1);
            } else if (total > 25 && total < 30) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", Excesso de peso!", "Calculo do IMC", 1);
            } else if (total >= 30 && total < 35) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", Obesidade grau 1!", "Calculo do IMC", 1);
            } else if (total >= 35 && total < 40) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", Obesidade grau 2!", "Calculo do IMC", 1);
            } else if (total > 40) {
                JOptionPane.showMessageDialog(null, "IMC é: " + imc + ", Obesidade grau 3!", "Calculo do IMC", 1);
            }

            closing();
        }
        catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Insira apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
            imc();
        }

    }
}
