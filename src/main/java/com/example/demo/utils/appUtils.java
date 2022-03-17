package com.example.demo.utils;

import com.example.demo.dto.DtoPlayer;
import com.example.demo.entity.Player;
import org.springframework.beans.BeanUtils;

public class appUtils {
    public static DtoPlayer entityToDto(Player player){
        DtoPlayer dtoPlayer = new DtoPlayer();
        BeanUtils.copyProperties(player,dtoPlayer);
        return dtoPlayer;
    }

    public static Player dtoToEntity(DtoPlayer dtoPlayer){
        Player player = new Player();
        BeanUtils.copyProperties(dtoPlayer,player);
        return player;
    }

}
