package br.com.rodrigo.apiorangetalents.model.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.rodrigo.apiorangetalents.model.entity.Pessoa;

@Repository
@Transactional
public class PessoaDAO {
	
	@Autowired
	private SessionFactory factory;
	
	public Session getCurrentSession() {
		return factory.getCurrentSession();
	}
		
	public void savePessoa(Pessoa pessoa) {
		getCurrentSession().save(pessoa);
	}

}
