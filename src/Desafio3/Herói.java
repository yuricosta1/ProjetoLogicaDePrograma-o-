package Desafio3;

public class Heroi {
    String nome;
    int idade;
    String tipo;

    String ataque() {
        return switch (tipo.toLowerCase()) {
            case "mago" -> "magia";
            case "guerreiro" -> "espada";
            case "monge" -> "artes marciais";
            case "ninja" -> "shuriken";
            default -> "um ataque desconhecido";
        };
    }
}