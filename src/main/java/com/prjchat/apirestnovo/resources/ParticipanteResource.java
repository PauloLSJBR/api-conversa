package com.prjchat.apirestnovo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjchat.apirestnovo.models.Participante;
import com.prjchat.apirestnovo.repository.ParticipanteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST CONVERSA")
@CrossOrigin(origins="*")
public class ParticipanteResource {

	@Autowired
	ParticipanteRepository participanteRepository;
	
	@ApiOperation(value="Retorna uma lista de Participantes")
	@GetMapping("/participantes")
	public List<Participante> listaParticipantes(){
		return participanteRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um Participante unico")
	@GetMapping("/participantes/{id}")
	public Participante listaUmParticipante(@PathVariable(value="id") long id){
		return participanteRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um Participante")
	@PostMapping("/participantes")
	public Participante salvaParticipante(@RequestBody Participante participante) {
		return participanteRepository.save(participante);
	}
	
	@ApiOperation(value="Deleta um Participante")
	@DeleteMapping("/participantes")
	public void apagaParticipante(@RequestBody Participante participante) {
		participanteRepository.delete(participante);
	}
	
	@ApiOperation(value="Atualiza um Participante")
	@PutMapping("/participantes")
	public Participante atualizaParticipante(@RequestBody Participante participante) {
		return participanteRepository.save(participante);
	}
}
