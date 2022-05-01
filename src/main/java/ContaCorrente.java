package ContaCorrente;

public class ContaCorrente {
    private String nome;
    private float saldo;

    public ContaCorrente() {
        nome="Candice";
        saldo=100;
    }

    public ContaCorrente(String nome, float saldo) {

        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente [nome=" + nome + ", saldo=" + saldo + "]";
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean Sacar(float valor) {
        if(valor<this.saldo) {
            saldo-= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    public float depositar (float valor) {
        this.saldo += valor;
        return valor;

    }
}


