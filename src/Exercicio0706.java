import javax.swing.*;

public class Exercicio0706 {
    public static void main(String args[]) {
        primeiro();
    }

    public static void closing() {
        int sim = 0;
        String valor = "";
        valor = JOptionPane.showInputDialog(null, "1 - continuar\n2 - sair ", "Calculo do INSS", 1);
        sim = Integer.parseInt(valor);
        if (sim == 1) {
            primeiro();
        } else {
            System.exit(0);
        }
    }
    public static void primeiro(){
        double salario = 0, salarioL = 0, ali = 0, salarionovo = 0, desconto = 0;
        float total = 0;
        String salario_inp = "", mensagem = "";

        try{
            salario_inp = JOptionPane.showInputDialog(null,"Insira o salário: ", "Calculo do INSS",1);
            salario_inp = salario_inp.replace(',','.');
            salario = Double.parseDouble(salario_inp);
            if (salario < 465){
                JOptionPane.showMessageDialog(null, "Salário invalido", "Ops!",0);
                primeiro();
            }
            else if (salario >= 465 && salario <= 965.67){
                ali = 8;
                salarionovo = salario * ali;
                salarionovo /= 100;
                salarioL = salario - salarionovo;
                total = (float)salarioL;
                mensagem = String.format("Salário : R$ %,.2f%nAliquota aplicada: %,.2f%nDesconto: %,.2f%nSalário liquido: %.2f",salario,ali,salarionovo,total);
                JOptionPane.showMessageDialog(null, mensagem, "Calculo do INSS", 1);
                closing();
            }
            else if (salario >= 965.68 && salario <= 1609.45){
                ali = 9;
                salarionovo = salario * ali;
                salarionovo /= 100;
                salarioL = salario - salarionovo;
                total = (float)salarioL;
                mensagem = String.format("Salário : R$ %,.2f%nAliquota aplicada: %,.2f%nDesconto: %,.2f%nSalário liquido: %.2f",salario,ali,salarionovo,total);
                JOptionPane.showMessageDialog(null, mensagem, "Calculo do INSS", 1);
                closing();
            }
            else if (salario >= 1609.46 && salario <= 3218.90){
                ali = 11;
                salarionovo = salario * ali;
                salarionovo /= 100;
                salarioL = salario - salarionovo;
                total = (float)salarioL;
                mensagem = String.format("Salário : R$ %,.2f%nAliquota aplicada: %,.2f%nDesconto: %,.2f%nSalário liquido: %.2f",salario,ali,salarionovo,total);
                JOptionPane.showMessageDialog(null, mensagem, "Calculo do INSS", 1);
                closing();
            }
            else{
                salarioL = salario - 354.07;
                total = (float)salarioL;
                mensagem = String.format("Salário : R$ %,.2f%nAliquota aplicada: %.2f%nDesconto: %,.2f%nSalário liquido: %.2f",salario,ali,354.07,total);
                JOptionPane.showMessageDialog(null, mensagem, "Calculo do INSS",1);
                closing();
            }

        }
        catch (NumberFormatException saida){
            System.exit(0);
        }
    }
}


