//Aprendendo a chamar outras classes dentro da Main e passar parametros

class Comprimentar {
    public static String saudacoes(String nome){
        String saudacao = ("Olá senhor(a):" + nome);
        return saudacao;
    }

    public String escolhendoGenero(String genero){
        if(genero == "mulher"){
            return "voce é mulher";
        }else if (genero == "homem") {
            return "voce é homi";
        }else {
            return "outro";
        }
    }
}

public class Comprimentando {
    public static void main (String[] args){
        System.out.println(Comprimentar.saudacoes("João Victor"));


        //Quando eu quero acessar um objeto sem Static é preciso estanciar o objeto para acessar esses métodos
        Comprimentar novoObjeto = new Comprimentar();
        System.out.println(novoObjeto.escolhendoGenero("mulher"));
    }
}


//vantagens entre static e instancia

//INSTANCIANDO:
//Exemplo Prático
//Imagine que a classe ContaBancaria tem uma variável de instância saldo:
//public class ContaBancaria {
//    private double saldo = 0.0; // Variável de INSTÂNCIA
//
//    // Método de INSTÂNCIA (sem static)
//    public void depositar(double valor) {
//        this.saldo += valor; // O método usa a variável 'saldo'
//    }
//
//    // ...
//}
//
//Vantagem ->
//Você cria duas contas:
//
//ContaBancaria contaA = new ContaBancaria();
//ContaBancaria contaB = new ContaBancaria();
//
//Quando você chama contaA.depositar(100.0);, o método depositar sabe exatamente que deve alterar o saldo da contaA, e
//não o da contaB.
//
//Se depositar fosse static, ele pertenceria à classe ContaBancaria e não saberia a qual saldo específico (A ou B) se
//referir.

// RESUMO: a vantagem de usar o static é pq ele é mais leve pq n precisa criar um novo objeto, mas a vantagem de
// trabalhar sem é pq eu posso criar varios objetos que vao instanciar o metodo e trabalhar de maneira independente.