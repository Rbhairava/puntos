package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;
import com.empresa.repository.MedicamentoRepository;

@Service
public class MedicamentoServiceImpl implements MedicamentoService{
	
	@Autowired
	private MedicamentoRepository repository;

	@Override
	public Medicamento insertaActualiza(Medicamento obj) {
		return repository.save(obj);
	}

	@Override
	public List<Medicamento> listaMedicamento() {
		return repository.findAll();
	}

	@Override

	public Optional<Medicamento> buscaPorId(int idMedicamento) {
		return repository.findById(idMedicamento);

	}



	@Override
	public List<Medicamento> listaMedicamentoPorNom(String nombre) {
	
		return repository.findByNombre(nombre);
	}

	@Override
	public List<Medicamento> listaMedicamentoPorStock(int stock) {
		return repository.findByStock(stock);
	}
	

}
