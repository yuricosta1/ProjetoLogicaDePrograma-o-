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
        scan.nextLine(); /* limpa o buffer, esse buffer é quando se usa o nextInt() e o nextDouble() e em sequencia
        se usa o nextLine, pois os metodos nextInt() e o nextDouble() quando executado guardam o enter, fazendo com que
        ao chegar no nextLine() o nextLine() seja executado automaticamente impedindo que o usuario de digite, sendo
        assim é necessario limpar o buffer para que o codigo funcione.*/
        tipoDeHeroi.tipo = scan.nextLine();
        System.out.println("O " + tipoDeHeroi.tipo + " atacou usando " + tipoDeHeroi.ataque());
    }
}