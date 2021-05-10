/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jogan
 */
public class CadastroController {
    
	EntityManagerFactory ins;
	EntityManager etm;

	
	public CadastroController() {
		ins = Persistence.createEntityManagerFactory("usuario");
		etm = ins.createEntityManager();
	}
	
	
	public void salvar (cadastro _usuario) {
		etm.getTransaction().begin();
		etm.merge(_usuario);
		etm.getTransaction().commit(); 
		ins.close();
	}
	
	
	public void remover (cadastro _usuario) {
		etm.getTransaction().begin();
		Query q = etm.createNativeQuery("delete usuario from usuario where nome = "+_usuario.getNome());
		q.executeUpdate();
		etm.getTransaction().commit(); 
		ins.close();
	}
	
	
	public List<cadastro> listar(){
		etm.getTransaction().begin();
		Query consulta = etm.createQuery("SELECT nome FROM usuario "); 
		List<cadastro> lista = consulta.getResultList();
		etm.getTransaction().commit(); 
		ins.close();
		return lista;
		
	}
	
}

