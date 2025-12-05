package Exercicios_Nivel_3;
//Importando a biblioteca do scanner (equivalente ao input do python)
import java.util.Scanner;

class validacao{
    public static Boolean tentativaLogin(String login, String senha){
        // Comparações de string são feitas com .equals
        if (login.equals("admin") && senha.equals("123")){
            return true;
        }else {
            return false;
        }
    }
}

public class Login {
    public static void main(String[] args){

        // Criando um objeto do tipo scanner para poder usar ao longo do código
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu login:");
        // Metodo para coletar o que o usuário digitar no terminal, acessando o objeto scanner criado podemos coletar
        // o que o usuário digitou na proxima linha com .nextLine(), e armazena isso em uma variavel.
        String login = scanner.nextLine();
        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        Boolean respostaLogin = validacao.tentativaLogin(login, senha);

        if(respostaLogin){
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Falha ao realizar o login. Verifique suas credenciais e tente novamente.");
        }
    }
}
