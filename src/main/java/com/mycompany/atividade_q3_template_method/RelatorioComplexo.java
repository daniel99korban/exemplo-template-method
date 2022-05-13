package com.mycompany.atividade_q3_template_method;

import objetos.Banco;
import objetos.Conta;
import templates.Relatorio;
/**
 * @author Daniel_Korban
 */
public class RelatorioComplexo extends Relatorio{
    private Banco banco;
    private String endereco;//pode ser composto
    private String telefone;
    private String email;
    private String dataAtual;

    public RelatorioComplexo(Banco banco, String endereco, String telefone, String email, String dataAtual) {
        this.banco = banco;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataAtual = dataAtual;
    }
    
    @Override
    protected void tipoRelatorio() {
        System.out.println("Relatório complexo");
    }
    
    @Override
    protected void cabecalho() {
        System.out.println("CABEÇALHO");
        System.out.println("Nome do Banco: " + banco.getNomeBanco());
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
    }

    @Override
    protected void corpo() {
        System.out.println("CORPO");
        // relatório complexo: exibe titular, agência, número da conta, e saldo.
        for(Conta conta : banco.getContas()){
            System.out.println("Nome do titular: " + conta.getNomeTitlar());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Conta: " + conta.getNumConta());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("---------------------------------");
        }
    }

    @Override
    protected void rodape() {
        System.out.println("RODAPÉ");
        System.out.println("E-mail: " + email);
        System.out.println("Data Atual: " + dataAtual);
    }

    
}
