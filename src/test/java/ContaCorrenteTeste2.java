import ContaCorrente.ContaCorrente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaCorrenteTeste2 {
    private String nome = "Candice";
    private float saldo = 0.0f;

    private float sacar;

    @Test
    public void saldoZerado() {
        ContaCorrente contaCorrenteTeste2 = new ContaCorrente(nome, saldo);

        contaCorrenteTeste2.depositar(0.0f);

        Assertions.assertEquals(0.0f, contaCorrenteTeste2.getSaldo());
    }

    @Test
    public void saqueSaldoZerado() {
        ContaCorrente contaCorrenteTeste = new ContaCorrente(nome, saldo);

        contaCorrenteTeste.Sacar(100.0f);

        Assertions.assertEquals(0.0f, contaCorrenteTeste.getSaldo());
    }
}
