package br.com.rodrigo.apiorangetalents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.rodrigo.apiorangetalents.model.entity.Pessoa;
import br.com.rodrigo.apiorangetalents.model.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaService service;

	@PostMapping
	public ResponseEntity<String> salvarCadastroDePessoa(@RequestBody Pessoa pessoa) {
		try {
			service.salvarPessoa(pessoa);
			return ResponseEntity.ok(pessoa.getNome() + " foi cadastrado com sucesso!");
		} catch (Exception e) {
			return ResponseEntity.badRequest().body("Já existe um cadastro com seu E-mail ou com seu CPF!");
		}

	}
}
