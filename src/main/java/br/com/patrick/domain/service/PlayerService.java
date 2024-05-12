package br.com.patrick.domain.service;

import br.com.patrick.domain.model.GroupType;
import br.com.patrick.domain.model.Player;
import br.com.patrick.domain.model.dtos.PlayerDto;
import br.com.patrick.domain.repository.PlayerRepository;
import br.com.patrick.infra.CodinameHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    @Autowired
    private CodinameHandler handler;

    public Player createPlayer(PlayerDto dto) {
        Player newPlayer = new Player(dto);
        String codiname = getCodiname(dto.groupType());
        newPlayer.setCodiname(codiname);
        return repository.save(newPlayer);
    }

    private String getCodiname(GroupType groupType){
        return handler.findCodiname(groupType);
    }


    public List<Player> getAllPlayers() {
        return repository.findAll();
    }
}
