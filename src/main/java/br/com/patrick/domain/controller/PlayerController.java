package br.com.patrick.domain.controller;

import br.com.patrick.domain.model.GroupType;
import br.com.patrick.domain.model.Player;
import br.com.patrick.domain.model.dtos.PlayerDto;
import br.com.patrick.domain.repository.PlayerRepository;
import br.com.patrick.domain.service.PlayerService;
import br.com.patrick.infra.CodinameHandler;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/uol")
public class PlayerController {

    @Autowired
    private PlayerService service;

    @PostMapping("/new")
    public ResponseEntity<Player> newPlayer (@RequestBody @Valid PlayerDto dto) {
        Player newPlayer = service.createPlayer(dto);
        return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Player>> getAllPlayers(){
        return new ResponseEntity<>(service.getAllPlayers(), HttpStatus.OK);
    }



}
