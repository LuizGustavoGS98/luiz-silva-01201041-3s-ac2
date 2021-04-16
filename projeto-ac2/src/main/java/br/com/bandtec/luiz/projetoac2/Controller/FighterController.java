package br.com.bandtec.luiz.projetoac2.Controller;

import br.com.bandtec.luiz.projetoac2.Domain.Fighter;
import br.com.bandtec.luiz.projetoac2.Repository.FighterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fighter")
public class FighterController {

    @Autowired
    private FighterRepository _repo;

    @GetMapping
    public ResponseEntity getFighters(){
        try{
            return ResponseEntity.ok().body(_repo.findAll());
        }
        catch (Exception e){
            return ResponseEntity.ok().body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity insertFighter(@RequestBody Fighter fighter){
        return ResponseEntity.ok().body(_repo.save(fighter));
    }

    @GetMapping("/count")
    public ResponseEntity countSurvivors(){
        try{
            return ResponseEntity.ok().body(_repo.countAllByVida());
        }
        catch (Exception e){
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }

    @GetMapping("/fightersDead")
    public ResponseEntity getDead(){
        try{
            return ResponseEntity.ok().body(_repo.findByVida());
        }
        catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }
}
