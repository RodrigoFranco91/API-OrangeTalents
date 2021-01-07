package br.com.rodrigo.apiorangetalents.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.rodrigo.apiorangetalents.model.dao.PessoaDAO;
import br.com.rodrigo.apiorangetalents.model.entity.Pessoa;

@Service
public class PessoaService {

	@Autowired
	PessoaDAO dao;
	
	public void salvarPessoa(Pessoa pessoa) {
		dao.savePessoa(pessoa);
	}

}
