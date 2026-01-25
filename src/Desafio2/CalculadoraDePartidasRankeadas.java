package Desafio2;
import java.util.Scanner;
public class CalculadoraDePartidasRankeadas {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ola Herói, quantas vitórias você tem? ");
        int vitorias = scan.nextInt();
        System.out.println("Ola Herói, quantas derrotas você tem? ");
        int derrotas = scan.nextInt();
        int saldoDeRankeadas = vitorias - derrotas;
        String nivel;//como a variavel já foi declarada na hora de por no if não é necessario por o String na variavel.
        if (saldoDeRankeadas < 10){nivel = "Ferro";}
        else if (saldoDeRankeadas >= 11 && saldoDeRankeadas <=20){nivel = "Bronze";}
        else if (saldoDeRankeadas >= 21 && saldoDeRankeadas <=50){nivel = "Prata";}
        else if (saldoDeRankeadas >= 51 && saldoDeRankeadas <=80){nivel = ("Ouro");}
        else if (saldoDeRankeadas >= 81 && saldoDeRankeadas <=90){nivel = ("Diamante");}
        else if (saldoDeRankeadas >= 91 && saldoDeRankeadas <=100){nivel = ("Lendário");}
        else {nivel = "Imortal";}
        System.out.println("O Herói tem o saldo de " + saldoDeRankeadas + " está no nível de " + nivel);
    }
}