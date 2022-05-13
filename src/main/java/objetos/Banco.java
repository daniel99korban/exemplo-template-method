package objetos;

import java.util.List;

/**
 *
 * @author Daniel_Korban
 */
public class Banco {
    private String nomeBanco;
    private List<Conta> contas;
    private double saldo;

    public Banco(String nomeBanco, List<Conta> contas, double saldo) {
        this.nomeBanco = nomeBanco;
        this.contas = contas;
        this.saldo = saldo;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public double getSaldo() {
        return saldo;
    }
}
