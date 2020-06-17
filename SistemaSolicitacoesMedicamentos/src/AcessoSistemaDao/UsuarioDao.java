package AcessoSistemaDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import AcessoSistemaDao.UsuarioDao;
import EntidadeSistema.Usuario;


public class UsuarioDao implements Dao<Usuario>{
	
	public List<Usuario> usuarios = new ArrayList<>();

	//construtor
	public UsuarioDao() {
		usuarios.add(new Usuario("José Henrique Melo", "JOSE@TESTE.COM", "545454335343", "Dipirona", "12 MG", "12321212312"));
	}
	
	//get
	public Optional<Usuario> buscar(long id) {
		return Optional.ofNullable(usuarios.get((int) id));
	}

	//getAll
	public List<Usuario> buscarTodos() {
		return usuarios;
	}

	public void salvar(Usuario usuarioEnviado) {
		usuarios.add(usuarioEnviado);

	}

	public void atualizar(Usuario usuarioEnviado, String[] params) {	
		for(int i =0;  i <  usuarios.size() ; i++) {		
			if(usuarios.get(i).getId() == usuarioEnviado.getId()) {			
				usuarios.set(i, usuarioEnviado);
			}
		}


	}

	public void deletar(Usuario usuarioEnviado) {
		for(int i =0;  i <  usuarios.size() ; i++) {		
			if(usuarios.get(i).getId() == usuarioEnviado.getId()) {			
				usuarios.remove(i);
			}
		}
	}

}
	




