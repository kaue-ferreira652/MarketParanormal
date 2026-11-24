package com.dest1.MarketParanormal.Controllers;

import com.dest1.MarketParanormal.Entities.MarketParanormal;
import com.dest1.MarketParanormal.repositories.MpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/Loja Paranormal")
@RestController
public class MpController {

    @Autowired

    private final MpRepository repository;

    public MpController(MpRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<MarketParanormal> mostrar(){
        return repository.findAll();
    }
    @PostMapping
    public void criar(@RequestBody MarketParanormal p){
        repository.save(p);
    }
}
