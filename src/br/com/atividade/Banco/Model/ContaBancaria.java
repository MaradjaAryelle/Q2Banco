package br.com.atividade.Banco.Model;
/*Crie uma classe para representar uma conta bancária, com atributos como número da conta,
titular e saldo. Depois, crie classes para representar diferentes tipos de conta,
como conta-corrente, conta poupança, etc., herdando da classe conta bancária.*/
public abstract class ContaBancaria {
    String numeroDaConta;
    String nomeTitular;
    Double saldoDaConta;

    ContaBancaria(String numeroDaConta, String nomeTitular, double saldoDaConta){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        this.saldoDaConta = saldoDaConta;
    }
}
