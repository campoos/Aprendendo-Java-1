package Exercicios_Nivel_1;

public class FaixaEtaria {
    public static void main(String[] args){
        int idade = -1;

        if (idade < 0){
            System.out.println("mentindo idade? nem existe idade abaixo de 0");
        } else if(idade > 0 && idade < 13){
            System.out.println("É criança");
        }else if (idade >= 13 && idade < 18) {
            System.out.println("É adolescente");
        }else if (idade >= 18 && idade < 60){
            System.out.println("É adulto");
        }else {
            System.out.println("É idoso");
        }
    }
}
