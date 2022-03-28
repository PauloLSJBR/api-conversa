package com.prjchat.apirestnovo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjchat.apirestnovo.models.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long>{
	
	Participante findById(long id);	

}
