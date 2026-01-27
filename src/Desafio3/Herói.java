package Desafio3;

public class Heroi {
    String nome;
    int idade;
    String tipo;
    /* quando precisa retornar um valor, não se usa o void no metodo, usa-se o return
    e quando se usa o retuen, não precisa usar o System.out.print*/
    String ataque() {
        return switch (tipo.toLowerCase()}) {
            case "mago" -> "magia";
            case "guerreiro" -> "espada";
            case "monge" -> "artes marciais";
            case "ninja" -> "shuriken";
            default -> "um ataque desconhecido";
        };
    }
}