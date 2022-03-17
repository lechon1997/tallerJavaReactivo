package com.example.demo.service;

import com.example.demo.dto.DtoPlayer;
import com.example.demo.entity.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.utils.appUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Comparator;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public Flux<DtoPlayer> getPlayers(){
        return repository.findAll().map(appUtils::entityToDto);
    }

    public Flux<DtoPlayer> getPlayerMayores(Integer edad){
        return repository.findByEdadGreaterThan(edad).map(appUtils::entityToDto);
    }

    public Flux<DtoPlayer> getPorNacionalidad(String nacionalidad){
        return repository.findByNacionalidad(nacionalidad).map(appUtils::entityToDto);
    }

    public Mono<DtoPlayer> savePlayer(Mono<DtoPlayer> dtoPlayerMono){
        return dtoPlayerMono.map(appUtils::dtoToEntity)
                .flatMap(repository::insert)
                .map(appUtils::entityToDto);
    }

    public Flux<DtoPlayer> getPorClub(String club) {
        return repository.findByClub(club).map(appUtils::entityToDto);
    }

    public Flux<DtoPlayer> getNacionalidades(){
        return repository.findAll().filter((Player a, Player b) -> { pl})
    }
}
