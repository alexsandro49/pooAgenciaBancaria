import java.util.UUID;

public class ContaBancaria {
    private UUID id;
    private String titular;
    private float saldo;
    private UUID agencia;

    ContaBancaria(String titular, AgenciaBancaria agencia) {
        this.id = UUID.randomUUID();
        this.titular = titular.toUpperCase();
        this.saldo = 0;
        this.agencia = agencia.getId();
    }

    ContaBancaria(String titular, AgenciaBancaria agencia, float valor) {
        this.id = UUID.randomUUID();
        this.titular = titular.toUpperCase();
        this.saldo = valor;
        this.agencia = agencia.getId();
    }

    public UUID getId() {
        return id;
    }

    public String getTitular() {
        return titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public UUID getAgencia() {
        return agencia;
    }

    void deposito(float valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido! Por favor, tente novamente.");
        }
    }

    void saque(float valor) {
        if (valor < 0) {
            System.out.println("Valor inválido! Por favor, tente novamente.");
        } else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
        }
    }
}
