//Criando class e dando o primeiro "console.log"

public class Consolelog {
    public static void main(String[] args){
        System.out.println("Meu primeito teste todando Java");
    }
}



//ANOTAÇÕES:
//
//CLASSE, OBJETO E INSTANCIA:
//A Classe (O Molde):
//public class Carro {
//    // ... define propriedades (cor, modelo, velocidade)
//    // ... define métodos (acelerar(), frear())
//}
//
//A Instanciação (Criação do Objeto): Na sua classe TestJava, quando você faz:
//public class TestJava {
//    public static void main(String[] args) {
//        // Instanciação: Criando um NOVO objeto 'Carro'
//        Carro meuFusca = new Carro();
//
//        // 'meuFusca' é agora um OBJETO INSTANCIADO.
//        // Ele é uma "instância" concreta da classe 'Carro'.
//
//        // Você pode chamar MÉTODOS nele:
//        meuFusca.acelerar(); // Chama o método 'acelerar' no objeto 'meuFusca'
//    }
//}
//
//Objeto Instanciado -> É uma cópia concreta e viva da estrutura definida pela Classe. Ele ocupa espaço na memória e
//possui seus próprios valores.
//
//Método -> É uma função ou comportamento (como acelerar()) que está definida dentro de uma classe e é executada por um
//objeto.
//
//Referenciar -> A variável meuFusca no exemplo acima está referenciando (apontando para) o objeto Carro que foi
//instanciado (criado).
//
//Em resumo, instanciar é o ato de criar um objeto para que ele possa executar os métodos e manipular as propriedades que
//foram definidas na classe original.
//
//------------------------------------------------------------------------------------------------------------------------
//
//O que é o public class Main? -> Definindo a classe
//
//    - class: palavra-chave obrigatória que informa ao Java que estou definindo um novo tipo de estrutura de dados,
//     todo o código deve ser armazenado dentro dessas classes (a CLASSE é um molde ou projeto para criar objetos)
//
//    - Main: é o nome que voce pode dar a classe, REGRA: sempre que ela for uma classe PUBLIC, ela deve ter o mesmo
//     nome do arquivo criado
//
//    - public: define a visibilidade que outras classes tem a esta classe, o public significa que pode ser acessada
//     e usada por qualquer outra classe
//
//------------------------------------------------------------------------------------------------------------------------
//
//Sobre o public static void main(String[] args) -> Assinatura do metodo principal do programa, ponto de inicio
//obrigatório que o Java procura para começar a rodar o código, funciona como o index.html para os navegadores
//
//    - public: define a visibilidade do metodo que nem o public da classe, isso para ser acessivel universalmente,
//    inclusive fora da classe (classeReferenciada.metodoClasse -> chamaria tipo assim), se for private ela só vai ser
//    acessivel pela propria classe
//
//    - static -> indica que o metodo pertence a essa classe e nao a objeto instanciado dessa classe, a gente usa ela
//    pq o java quando inicia o codigo procura a main(), e se nao for static, o Java primeiro cria um objeto da classe
//    Main (ex: new Main().main()) antes de poder chamar, isso demora muito, e quando tem static a JVM ja chama direto
//    sem precisar criar o objeto. exemplo sem static:
//
//    // Em outra classe
//    public class OutraClasse {
//        public static void main(String[] args) {
//            TestJava meuObjeto = new TestJava(); // 1. Cria um objeto
//            meuObjeto.metodoPublicoNaoStatico(); // 2. Chama o método no objeto
//        }
//    }
//
//    - void -> indica o tipo de valor que o metodo retorna depois de ser executado, void significa vazio, ou seja que nao
//    retorna nada, mas poderia ser um public int, public double, list:
//
//    // Retorna uma String
//    public String criarSaudacao(String nome) {
//        return "Olá, " + nome + "!";
//    }
//
//    // Retorna uma Lista de Strings
//    public List<String> getListaNomes() {
//        List<String> nomes = new ArrayList<>();
//        nomes.add("Ana");
//        nomes.add("Beto");
//        // OBRIGATÓRIO: Retorna um objeto do tipo List<String>
//        return nomes;
//    }
//
//    -main -> e o nome obrigatório do metodo principal, que o java sempre vai buscar um metodo com esse exato nome para
//    começar a rodar o codigo.
//
//    - (String[] args) -> Lista de argumentos que o metodo espera receber
//        String[] - Indica que o metodo espera receber um array de objetos do tipo String
//        args - é o nome da variavel que contem esse array
//
//        public class CumprimentaUsuario {
//            public static void main(String[] args) {
//
//                // O array 'args' é preenchido com o que foi passado na linha de comando
//
//                // 1. Verificar se algum argumento foi passado
//                if (args.length > 0) {
//
//                    // 2. Acessar o PRIMEIRO argumento (índice 0, como em qualquer array)
//                    String nome = args[0];
//
//                    System.out.println("Olá, " + nome + "! Seu programa está rodando.");
//
//                } else {
//                    System.out.println("Nenhum argumento foi passado. Execute com 'java CumprimentaUsuario [SEU NOME]'");
//                }
//            }
//        }
//
//------------------------------------------------------------------------------------------------------------------------
//
//Entendendo System.out.println() -> exibindo mensagens no terminal
//        System -> classe padrao para acessar recursos do sistema
//        .out -> variavel da classe system que serve para gerar saidas
//        .println("...") -> metodo do out (abreviacaçõ de print line), ele imprime o conteudo dentro do println e pula
//        uma linha










