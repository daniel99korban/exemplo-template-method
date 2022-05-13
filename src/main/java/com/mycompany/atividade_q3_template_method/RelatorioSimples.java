package com.mycompany.atividade_q3_template_method;

import objetos.Banco;
import objetos.Conta;
import templates.Relatorio;

/**
 * @author Daniel_Korban
 */
public class RelatorioSimples extends Relatorio{

    private Banco banco;
    private String telefone;

    public RelatorioSimples(Banco banco, String telefone) {
        this.banco = banco;
        this.telefone = telefone;
    }
    
    @Override
    protected void tipoRelatorio() {
        System.out.println("Relatório Simples");
    }
    
    @Override
    protected void cabecalho() {
        System.out.println("CABEÇALHO");
        System.out.println("Nome do Banco: " + this.banco.getNomeBanco());
    }

    @Override
    protected void corpo() {
        System.out.println("CORPO");
        // lista de contas nome titular e saldo da conta
        for(Conta conta: banco.getContas()){
            System.out.println("Nome Titular: " + conta.getNomeTitlar());
            System.out.println("Saldo: " + conta.getSaldo());
            System.out.println("---------------------------------");
        }
    }

    @Override
    protected void rodape() {
        System.out.println("RODAPÉ");
        System.out.println("Telefone: " + this.telefone);
    }

    
}
