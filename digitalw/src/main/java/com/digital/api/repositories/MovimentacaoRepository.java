package com.digital.api.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.digital.api.entity.Movimentacao;

public interface MovimentacaoRepository extends PagingAndSortingRepository<Movimentacao, Long>{

	
	List<Movimentacao> findByIdUsuarioAndTipoMovimentacao(Long idUsuario, String tipo);
	
	List<Movimentacao> findByIdUsuario(Long idUsuario);
	
		
}
