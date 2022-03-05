package Decimo;

public class Titular {
    private int id;
    private String titular;
    private long saldo;

    public Titular(int id, String titular, long saldo) {
        this.id = id;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
}
