package Exercicios_NIvel_2;

class validacao{
    public static Boolean tentativaLogin(String login, String senha){
        if (login == "admin" && senha == "123"){
            return true;
        }else {
            return false;
        }
    }
}

public class Login {
    public static void main(String[] args){

        Boolean respostaLogin = validacao.tentativaLogin(login, senha);

        if(respostaLogin){
            System.out.println("Login realizado com sucesso!");
        }else {
            System.out.println("Falha ao realizar o login. Verifique suas credenciais e tente novamente.");
        }
    }
}
