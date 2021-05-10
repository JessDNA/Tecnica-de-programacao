/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastros;

import java.util.List;

/**
 *
 * @author jogan
 */
public class CadastroTest {

	public static void main(String[] args) {
				
		CadastroController con = new CadastroController();
		
		List<cadastro> usuarios = (List<cadastro>) con.listar();
		
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println("Nome: " +usuarios.get(i).getNome());
		}
		
			/*con.salvar(a1);
			con.salvar(a2);
			con.salvar(a3);
			con.remover(a1);*/
		
	}
}
