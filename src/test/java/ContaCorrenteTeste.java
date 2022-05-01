import ContaCorrente.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste {
    private String nome = "Candice";
    private float saldo = 0.0f;

    private float sacar;

    @Test
    public void saldoZerado() {
        ContaCorrente contaCorrenteTeste = new ContaCorrente(nome, saldo);

        contaCorrenteTeste.depositar(0.0f);

        Assertions.assertEquals(0.0f, contaCorrenteTeste.getSaldo());
    }

    @Test
    public void saqueSaldoZerado() {
        ContaCorrente contaCorrenteTeste = new ContaCorrente(nome, saldo);

        contaCorrenteTeste.Sacar(100.0f);

        Assertions.assertEquals(0.0f, contaCorrenteTeste.getSaldo());
    }

    @Test
    public void adicionarSaldoConta () {
        ContaCorrente contaCorrenteTeste = new ContaCorrente(nome, saldo);

        contaCorrenteTeste.depositar(1000.0f);

        Assertions.assertEquals(1000.0f, contaCorrenteTeste.getSaldo());
    }
    @Test
    public void realizarSaque () {
        ContaCorrente contaCorrenteTeste = new ContaCorrente(nome, saldo);

        contaCorrenteTeste.depositar(1000.0f);
        contaCorrenteTeste.Sacar(300.0f);

        Assertions.assertEquals(700.0f, contaCorrenteTeste.getSaldo());
    }
}
