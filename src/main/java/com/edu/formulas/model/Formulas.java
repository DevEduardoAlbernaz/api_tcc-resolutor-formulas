package com.edu.formulas.model;

import com.edu.formulas.dto.FormulasRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name ="formulas")
@Entity(name ="formulas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id_formulas")
public class Formulas {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_formulas;
    private String formula;
    private String sintax;
    private String pap;
    private Double resultado;

    public Formulas(FormulasRequestDTO data){
        this.formula = data.formulas();
        this.sintax = data.sintax();
        this.pap = data.pap();
        this.resultado = data.resultado();

    }
}
