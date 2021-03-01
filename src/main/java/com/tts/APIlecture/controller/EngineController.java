package com.tts.APIlecture.controller;

import com.tts.APIlecture.model.Engine;
import com.tts.APIlecture.repo.EngineRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/engine")
@RestController
public class EngineController {

    private EngineRepository engineRepository;
    public EngineController(EngineRepository engineRepository){
        this.engineRepository = engineRepository;
    }

    @PostMapping("/add")
    public Engine addEngine(Engine engine){
        return engineRepository.save(engine);
    }

    @GetMapping("/all")
    public Iterable getAllEngines(){
        return engineRepository.findAll();
    }

    //example: dealerships/{dealershipId}/cars/{carId}
    @GetMapping("/{id}")
    public Optional<Engine> getEngine(@PathVariable Long id){
        return engineRepository.findById(id);
    }
}
