package com.mala.aws.malaCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MalaCloudApplication {

	public static void main(String[] args) {
		System.out.println("Teste Spring");

		SpringApplication.run(MalaCloudApplication.class, args);
	}

	@GetMapping("/mala/carro/{codigoCarro}")
	public String malaGet(@PathVariable String codigoCarro){

		String carro="";
		if(codigoCarro.equals("1")){
			carro = "Maverick";
		}
		if(codigoCarro.equals("2")){
			carro = "Fusca";
		}
		if(codigoCarro.equals("3")){
			carro = "Mala Carro";
		}

		return  carro;
	}


	@GetMapping("/giselia/placa")

	public String placaGet(){ return  "{codigo: 1}, {placa:XXXX -1234}, {codigo:2}, {placa:YYYY - 4567}";
	}

	@PostMapping("/chico/gravar")
		public String gravar(){
		System.out.println("Gravou os dadsos");
		return  "gravou os dados PR";
	}


	@GetMapping("/mala")
	public String teste(){ return  "{codigo: 1}, {placa:XXXX -1234}, {codigo:2}, {placa:YYYY - 4567}";
	}


	@GetMapping("/durval")
	public String durvla(){ return  "{codigo: durval 1}, {placa:durval  -1234}, {codigo:2}, {placa:durval - 4567}";
	}

}
