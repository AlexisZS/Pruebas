package pe.com.proygym.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.com.proygym.model.Usuario;


@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, String> {
	
	@Query("select d from Usuario d where d.nombre = :v_nom")
	public List<Usuario> obtenerSeriesPorId(@Param("v_nom")String nom);

}
