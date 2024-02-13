package th.ac.cmu.demo;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerRepository implements PlayerService{
    private Map<String, Player> map = new HashMap<>();
    @Override
    public Player createPlayer(String name){
        if(map.containsKey(name))
                return map.get(name);
        Player player = new Player(name);
        map.put(name, player);
        return player;
    }
}
