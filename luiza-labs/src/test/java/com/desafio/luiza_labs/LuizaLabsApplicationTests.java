package com.desafio.luiza_labs;

import com.desafio.luiza_labs.service.Service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.util.List;

@SpringBootTest
class LuizaLabsApplicationTests {
	@Autowired
	private Service service;

	@Test
	void listandoArquivosTeste() {
		List<File> files = service.buscarInformacao("walt disney");
		Assertions.assertNotNull(files);
	}

}
