package dominio;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Embeddable
public class Telefone {

    @Column(length = 3, nullable = false)
    private String prefixo;
    @Column(length = 20, nullable = false)
    private String numero;
    @Column(length = 5)
    private String ramal;

}
