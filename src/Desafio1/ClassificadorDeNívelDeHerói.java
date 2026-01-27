package Desafio1;
import java.util.Scanner;
public class ClassificadorDeNívelDeHerói {
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Qual o seu nome nobre Herói? ");
       String nome = scan.nextLine();
       System.out.printf("Nobre %s, quanto de XP você tem? ", nome);
       int xp = scan.nextInt();
        if ( xp < 1000) { System.out.printf("%s O Herói",nome, "está no nível Ferro");}
        else if (xp >= 1001 && xp <= 2000) {System.out.printf("O Herói %s está no nível Bronze",nome);}
        else if (xp >= 2001 && xp <= 5000) { System.out.printf("O Herói %s está no nível Prata",nome);}
        else if (xp >= 6001 && xp <= 7000) {System.out.printf("O Herói %s está no nível Ouro",nome);}
        else if (xp >= 7001 && xp <= 8000) { System.out.printf("O Herói %s está no nível Platina",nome);}
        else if (xp >= 8001 && xp <= 9000) {System.out.printf("O Herói %s está no nível Ascendente",nome);}
        else if (xp >= 9001 && xp <= 10000) {System.out.printf(" Herói %s está no nível Imortal",nome);}
        else  {System.out.printf("O Herói %s está no nível Radiante",nome);}
    }
}
