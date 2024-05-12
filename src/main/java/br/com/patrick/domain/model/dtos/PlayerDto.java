package br.com.patrick.domain.model.dtos;

import br.com.patrick.domain.model.GroupType;

public record PlayerDto(

        String name,
        String email,
        String phoneNumber,
        GroupType groupType

) {
}
