package com.example.player;

import org.springframework.web.bind.annotation.*;
 import java.util.ArrayList;
 import com.example.player.PlayerService;
@RestController
public class PlayerController{
    PlayerService ps = new PlayerService();
    @GetMapping("/players")
    public ArrayList<Player> getPlayers(){
        return ps.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player){
        return ps.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayer(@PathVariable int playerId){
        return ps.getPlayer(playerId);
    }
    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player){
        return ps.updatePlayer(playerId,player);
    }

    @PutMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable int playerId){
         ps.deletePlayer(playerId);
    }
}