import java.util.Scanner;
import java.math.BigDecimal;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Compra cp = new Compra();
    
    System.out.println("Valor da compra: ");
    BigDecimal valorCompra = sc.nextBigDecimal();
    cp.adicionarValor(valorCompra);

    cp.definirDesconto(Main::aplicarDescontoNatal);
    System.out.println("Valor com desconto: " + cp.obterValorFinal());

    cp.definirDesconto(Main::aplicarDescontoPascoa);
    System.out.println("Valor com desconto: " + cp.obterValorFinal());
  }

  public static BigDecimal aplicarDescontoNatal(final BigDecimal valorCompra) {
      return valorCompra.multiply(BigDecimal.valueOf(0.9));
  }

  public static BigDecimal aplicarDescontoPascoa(final BigDecimal valorCompra) {
      return valorCompra.multiply(BigDecimal.valueOf(0.5));
  }
}