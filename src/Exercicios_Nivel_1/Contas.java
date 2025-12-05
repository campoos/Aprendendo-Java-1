package Exercicios_Nivel_1;

import java.util.ArrayList;
import java.util.List;

class operacoes {
    public static List<Double> contas(double a, double b){

        // Criando o objeto array que vai guardar os resultados
        List<Double> resultados = new ArrayList<>();

        resultados.add(a + b);
        resultados.add(a - b);
        resultados.add(a * b);

        if(b != 0){
            resultados.add(a / b);
        }else {
            //Fallback
            resultados.add(0.0);
        }

        return resultados;
    }
}

public class Contas {
    public static void main(String[] args){
        int numero1 = 10;
        int numero2 = 10;
        List<Double> resultadosConta = operacoes.contas(numero1, numero2);

        System.out.println("Abaixo os resultados das 4 principais operações matemáticas para os números selecionados: (" + numero1 + "e" + numero2);
        System.out.println("Soma:" + resultadosConta.get(0));
        System.out.println("Substração:" + resultadosConta.get(1));
        System.out.println("Multiplicação:" + resultadosConta.get(2));
        System.out.println("Divisão:" + resultadosConta.get(3));
    }
}
