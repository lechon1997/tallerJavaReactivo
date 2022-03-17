package com.example.demo.controller;

import com.example.demo.dto.DtoPlayer;
import com.example.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin("*")
@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService service;

    @GetMapping
    public Flux<DtoPlayer> getPlayers(){
        return service.getPlayers();
    }

    @GetMapping("/mayor/{edad}")
    public Flux<DtoPlayer> getPlayersMayores(@PathVariable Integer edad){
        return service.getPlayerMayores(edad);
    }
    @GetMapping("/nacionalidad")
    public Flux<DtoPlayer> getNacionalidades(){
        return service.getNacionalidades();
    }
    @GetMapping("/nacionalidad/{nacionalidad}")
    public Flux<DtoPlayer> getPorNacionalidad(@PathVariable String nacionalidad){
        return service.getPorNacionalidad(nacionalidad);
    }

    @GetMapping("/club/{club}")
    public Flux<DtoPlayer> getPorClub(@PathVariable String club){
        return service.getPorClub(club);
    }

    @PostMapping
    public Mono<DtoPlayer> savePlayer(@RequestBody Mono<DtoPlayer> playerDtoMono){
        return service.savePlayer(playerDtoMono);
    }

}
