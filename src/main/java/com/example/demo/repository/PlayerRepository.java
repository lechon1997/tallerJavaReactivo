package com.example.demo.repository;

import com.example.demo.dto.DtoPlayer;
import com.example.demo.entity.Player;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface PlayerRepository extends ReactiveMongoRepository<Player,String> {
    Flux<Player> findByNacionalidad(String nacionalidad);
    Flux<Player> findByEdadGreaterThan(Integer edad);
    Flux<Player> findByClub(String club);
}
