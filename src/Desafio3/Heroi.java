package Desafio3;

public class Heroi {
    String nome;
    int idade;
    String tipo;
    /* Quando precisa retornar um valor, não se usa o void no metodo, usa-se o return  quando se usa o retuen,
    não precisa usar o System.out.print no Switch case, lembrando também que quando declara o metodo sem o void é
    necessesário declarar que tipo sera aquele metodo.*/
    String ataque() {
        return switch (tipo.toLowerCase()) {
            //toLowrCase = deixar tudo minusculo e toUpCase deixa tudo maiusculo.
            case "mago" -> "magia";
            case "guerreiro" -> "espada";
            case "monge" -> "artes marciais";
            case "ninja" -> "shuriken";
            default -> "um ataque desconhecido";
        };
    }
}