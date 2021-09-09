package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.entity.Medicamento;
import java.util.List;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

	public List<Medicamento> findByNombre(String nombre);
	
	public List<Medicamento> findByStock(int stock);
	
	
}
