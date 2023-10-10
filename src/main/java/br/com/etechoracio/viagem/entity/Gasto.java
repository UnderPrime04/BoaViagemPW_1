//ANA E KALEB

package br.com.etechoracio.viagem.entity;

import br.com.etechoracio.viagem.enums.CategoriaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="TBL_GASTO")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_GASTO")
    private Long id;
    @Column(name="TX_DESCRICAO")
    private String descricao;
    @Column(name="TX_LOCAL")
    private String local;

    @Column(name="TP_CATEGORIA")
    @Enumerated(EnumType.STRING)
    private CategoriaEnum tipoCategoria;

    @Column(name="DT_GASTO")
    private LocalDate dataGasto;

    @Column(name="VLR_GASTO")
    private float gasto;

    @ManyToOne
    @JoinColumn(name="ID_VIAGEM")
    private Viagem viagem;
}
