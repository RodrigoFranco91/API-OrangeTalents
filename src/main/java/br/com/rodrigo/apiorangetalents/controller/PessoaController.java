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
	public ResponseEntity<Pessoa> salvarCadastroDePessoa(@RequestBody Pessoa pessoa) {
		service.salvarPessoa(pessoa);
		return ResponseEntity.ok(pessoa);
	}

}
