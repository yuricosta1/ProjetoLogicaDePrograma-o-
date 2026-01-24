package Desafio3;
import java.util.Scanner;
public class EscrevendoAsClassesDeUmJogo {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        Heroi tipoDeHeroi = new Heroi ();
        System.out.println("Nobre Herói qual o seu nome? ");
        tipoDeHeroi.nome = scan.nextLine();
        System.out.println("Nobre Herói Qual sua idade? ");
        tipoDeHeroi.idade = scan.nextInt();
        System.out.println("Qual a Sua classe? ");
        scan.nextLine(); // limpa o buffer
        tipoDeHeroi.tipo = scan.nextLine();
        System.out.println("O " + tipoDeHeroi.tipo + " atacou usando " + tipoDeHeroi.ataque());
    }
}