package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "players")
public class Player {
    @Id
    private String id;
    private String name;
    private Integer edad;
    private String nacionalidad;
    private String club;
    private Integer ranking;

    public Player() {
    }

    public Player(String name, Integer edad, String nacionalidad,String club,Integer ranking) {
        this.name = name;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.club = club;
        this.ranking = ranking;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getId() {
        return id;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public interface INacionalidades{
        String getNacionalidad();
    }
}