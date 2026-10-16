package br.com.aweb.sistema_de_vendas.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Endereco {

    @NotBlank(message = "O logradouro é obrigatório")
    @Column(nullable = false, length = 120)
    private String logradouro;

    @Column(nullable = true)
    private Integer numero;

    @Column(nullable = true, length = 200)
    private String complemento;

    @NotBlank(message = "O bairro é obrigatório")
    @Column(nullable = false, length = 100)
    private String bairro;

    @NotBlank(message = "A cidade é obrigatória")
    @Column(nullable = false, length = 100)
    private String cidade;

    @NotBlank(message = "O UF é obrigatório")
    @Column(nullable = false, length = 50)
    private String uf;

    @NotBlank(message = "O CEP é obrigatório")
    @Column(nullable = false, length = 10)
    private String cep;
}
