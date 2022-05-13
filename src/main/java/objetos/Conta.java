package objetos;
/**
 * @author Daniel_Korban
 */
public class Conta {
    private String nomeTitlar;
    private double saldo;
    private String agencia;
    private String numConta;

    public Conta(String nomeTitlar, double saldo, String agencia, String numConta) {
        this.nomeTitlar = nomeTitlar;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numConta = numConta;
    }

    public String getNomeTitlar() {
        return nomeTitlar;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumConta() {
        return numConta;
    }
    
    @Override
    public String toString() {
        return "Dados da Conta: \n" + "Nome do Titlar : " + nomeTitlar + "\nSaldo : " + saldo + "\nAgencia : " + agencia + "\nNumero da Conta : " + numConta;
    }
    
}
