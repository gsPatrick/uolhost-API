package br.com.patrick.domain.model;

import br.com.patrick.domain.model.dtos.PlayerDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity(name = "players")
@Table(name = "players")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    private String phoneNumber;
    private String codiname;
    private GroupType groupType;

    public Player(PlayerDto dto) {
        this.name = dto.name();
        this.email = dto.email();
        this.groupType = dto.groupType();
        this.phoneNumber = dto.phoneNumber();
    }
}
