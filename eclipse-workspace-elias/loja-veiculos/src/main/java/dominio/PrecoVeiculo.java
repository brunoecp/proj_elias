package dominio;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class PrecoVeiculo {

    private String modelo;
    private BigDecimal valor;
}
