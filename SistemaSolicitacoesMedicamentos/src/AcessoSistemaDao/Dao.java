package AcessoSistemaDao;

import java.util.List;
import java.util.Optional;



	public interface Dao<T> {
		
		Optional<T> buscar(long id); 
	    
	    List<T> buscarTodos(); 
	     
	    void salvar(T t); 
	     
	    void atualizar(T t, String[] params); 
	     
	    void deletar(T t); 
		
		
	}



