package com.desafio.luiza_labs.controler;

import com.desafio.luiza_labs.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "*")
public class Controller {

    @Autowired
    private Service service;

    @RequestMapping(value = "/busca/{palavraBusca}", method = RequestMethod.GET)
    public ResponseEntity<?> buscarPorId(@PathVariable("palavraBusca") String palavraBusca) {
        List<File> files = this.service.buscarInformacao(palavraBusca);
        return new ResponseEntity(files, HttpStatus.OK);
    }
}
