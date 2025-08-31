package model;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Cupom {
    private int idCupom;
    private String codigo;
    private BigDecimal desconto; // se <= 1 => percentual (0.10), se >1 => valor fixo
    private LocalDateTime validade;
    private List<Integer> aplicavelEm; // ids de produto, opcional

    public Cupom(String codigo, BigDecimal desconto, LocalDateTime validade) {
        this.codigo = codigo;
        this.desconto = desconto;
        this.validade = validade;
    }

    public boolean validarCupom() {
        return validade == null || LocalDateTime.now().isBefore(validade);
    }

    public BigDecimal calcularDesconto(BigDecimal total) {
        if (desconto == null || total == null) return BigDecimal.ZERO;
        if (desconto.compareTo(BigDecimal.ONE) <= 0) {
            // percentual
            return total.multiply(desconto);
        } else {
            // valor fixo
            return desconto.min(total);
        }
    }

    // getters/setters (omitidos para brevidade)
}
