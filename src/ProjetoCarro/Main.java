package ProjetoCarro;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String args[]){
        Proprietario proprietario = new Proprietario();
        Proprietario.nome = "Alex"";
        Proprietario.bairro = "Atalaia";
        Proprietario.cep = "67013150"";
        Proprietario.cidade = "Ananindeua";
        Proprietario.estado = "Para";
        Proprietario.cpf = "12344468500";
        Proprietario.dataNascimento = "121245";



        Carro carro = new Carro();
        Carro.nPortas = 5;
        Carro.nMarchas = 5;
        Carro.marchaAtual = 1;
        Carro.proprietario = proprietario;
        Carro.velocidadeAtual = 10;

        System.out.println(carro.velocidadeAtual);


            }
        };
    }
}
