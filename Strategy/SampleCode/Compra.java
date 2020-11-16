import java.util.function.Function;
import java.math.BigDecimal;

public class Compra {
  private BigDecimal valor;
  private Function<BigDecimal, BigDecimal> aplicadorDesconto;

  public Compra() {
    valor = new BigDecimal(0);
  }

  public void definirDesconto(Function<BigDecimal, BigDecimal> aplicadorDesconto) {
    this.aplicadorDesconto = aplicadorDesconto;
  }

  public void adicionarValor(BigDecimal valor) {
    this.valor = this.valor.add(valor);
  }

  public BigDecimal obterValorFinal() {
    return aplicadorDesconto.apply(this.valor);
  }
}