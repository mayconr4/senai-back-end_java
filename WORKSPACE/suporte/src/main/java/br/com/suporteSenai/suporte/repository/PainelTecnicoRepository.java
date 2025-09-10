package br.com.suporteSenai.suporte.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.suporteSenai.suporte.model.PainelTecnico;  

@Repository
public interface PainelTecnicoRepository extends CrudRepository<PainelTecnico, Long>{
	//Método para buscar por idSolicitacao / indicando a chave estrangeira
	Optional<PainelTecnico> findByIdSolicitacao(Long idSolicitacao);
	
}
