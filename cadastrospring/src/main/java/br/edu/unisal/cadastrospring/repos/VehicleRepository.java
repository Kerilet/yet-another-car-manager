package br.edu.unisal.cadastrospring.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unisal.cadastrospring.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,Long>{

}
