package com.mycompany.atividade_q3_template_method;

import java.util.ArrayList;
import java.util.List;
import objetos.Banco;
import objetos.Conta;
import templates.Relatorio;

/**
 * @author Daniel_Korban
 */
public class Atividade_q3_template_method {

    public static void main(String[] args) {
        // lista de contas
        List<Conta> contas = new ArrayList<>();
        //Conta -> numero do titular, saldo, agencia, numero da conta
        contas.add(new Conta("teste1", 100, "01", "996"));
        contas.add(new Conta("teste2", 100, "02", "997"));
        contas.add(new Conta("teste3", 100, "03", "998"));
        
        Relatorio relatorioSimples = new RelatorioSimples(new Banco("banco1", contas, 150.99), "(98) 99999-9999");
        // Relatorio Simples
        relatorioSimples.exibirRelatorio();
        
        Relatorio relatorioComplexo = new RelatorioComplexo(new Banco("banco2", contas, 150.99), "amaral bloco1 09", "(99) 99999-9999", "fulano@gmail.com", "13/05/2020");
        // Relatorio complexo
        relatorioComplexo.exibirRelatorio();
    }
}

/*
Relatórios são muito parecidos: todos eles contêm cabeçalho, corpo, e rodapé.
Existem dois tipos de relatórios: simples e complexos.

As diferenças são sutis: 
relatórios simples 
possuem: { cabeçalhos(nome do banco), rodapés(telefone) }  de uma linha (String).

relatórios complexos 
possuem: {cabeçalhos(nome do banco, endereço, telefone), rodapés(e-mail, data atual)}

Além disso!
dada uma lista de contas
relatório simples:  apenas imprime titular e saldo da conta. 
relatório complexo: exibe titular, agência, número da conta, e saldo.

Usando Template Method, para implementar o mecanismo de relatórios. Usar dados falsos para os dados do banco
 */
