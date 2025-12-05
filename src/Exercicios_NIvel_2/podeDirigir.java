package Exercicios_NIvel_2;

class condicionalDirigir {
    public static Boolean condicional(int idade){
        if(idade < 18){
            return false;
        }else {
            return true;
        }
    }
}

public class podeDirigir {
    public static void main(String[] args){
        int idade = 18;

        Boolean respostaCondicional = condicionalDirigir.condicional(idade);

        if (respostaCondicional){
            System.out.println("Voce pode dirigir");
        }else{
            System.out.println("Voce não pode dirigir");
        }
    }
}
