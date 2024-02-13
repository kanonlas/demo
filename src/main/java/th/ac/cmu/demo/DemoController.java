package th.ac.cmu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //access from any web = safety
@RestController
public class DemoController {
    @Autowired // connect interface to class
    private PlayerService playerService;

    @PostMapping("/player") //tell path to Spring
    public Player createNewPlayer(@RequestBody String body){
        return this.playerService.createPlayer(body);
    }


//    @GetMapping("/player") //tell path to Spring
//    public Player createNewPlayer(@RequestBody String body){
//
//    }
    /*
    @GetMapping("/")
        public String a(){
            return "hello";
        }
*/

}
