package com.desafio.luiza_labs.service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    public List<File> buscarInformacao(String palavraBusca) {
        List files = new ArrayList();
        File file = new File("D:\\github\\desafio-luizalabs\\luiza-labs\\src\\main\\java\\com\\desafio\\luiza_labs\\movies");
        File afile[] = file.listFiles();
        int i = 0;
        for (int j = afile.length; i < j; i++) {
            File arquivos = afile[i];
            try {
                String texto = Files.readString(Path.of(arquivos.toURI()), StandardCharsets.UTF_8);
                if (texto.contains(palavraBusca)){
                    files.add(arquivos);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return files;
    }
}
