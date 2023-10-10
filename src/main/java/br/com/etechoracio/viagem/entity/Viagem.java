package br.com.etechoracio.viagem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter 
@Setter
@Entity
@Table(name="TBL_VIAGEM")
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_VIAGEM")
    private long id;

    @Column(name="TX_DESTINO")
    private String destino;

    @Column(name="TP_VIAGEM")
    private String tipoViagem;

    @Column(name="DT_CHEGADA")
    private LocalDate dataChegada;

    @Column(name="DT_SAIDA")
    private LocalDate dataSaida;

    @Column(name="VLR_ORCAMENTO")
    private double valorOrcamento;

    @Column(name="QTD_PESSOAS")
    private Integer quantidadePessoas;

}
