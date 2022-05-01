import ContaCorrente.ContaCorrente;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();

        int stop;

        do {
            stop = Integer.parseInt(JOptionPane.showInputDialog("Conta Corrente" +
                    " 1- Sacar" +
                    " 2- Depositar" +
                    " 3- Consulta Saldo"
            ));
            switch(stop) {
                case 1:
                    float valor=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque: "));
                    contaCorrente.Sacar(valor);break;
                case 2:
                    float Depo=Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do DEPÓSITO:"));
                    contaCorrente.depositar(Depo);break;
                case 3:
                    System.out.println(contaCorrente.toString());
            }
        }while (stop!=4);
        System.out.println("Programa finalizado");
    }
}