package Exercicios_NIvel_2;

class calcularIMC{
    public static Double calculo (Double peso, Double altura){

        return peso / (altura * altura);
    }
}

public class IMC {
    public static void main(String[] args){

        Double peso = 57.7;
        Double altura = 1.7;

        System.out.println("Seu IMC é: " + calcularIMC.calculo(peso, altura));

    }
}
