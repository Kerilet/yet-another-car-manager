package br.edu.unisal.cadastrospring.controller;

import br.edu.unisal.cadastrospring.domain.Vehicle;
import br.edu.unisal.cadastrospring.repos.VehicleRepository;
import jakarta.validation.Valid;

import java.util.List;
// import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
@RequestMapping("/api/vehicles")
public class VehicleController {
    private final VehicleRepository repo;

    public VehicleController(VehicleRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Vehicle> listAll(){ return repo.findAll(); }

    @GetMapping("/{id}")   
    public Vehicle listById(@PathVariable Long id) {
         return repo.findById(id).orElse(new Vehicle());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vehicle save(@Valid @RequestBody Vehicle vehicle){
        vehicle.setId(null);
        vehicle.setBrand(vehicle.getBrand());
        vehicle.setModel(vehicle.getModel());
        vehicle.setFabricationYear(vehicle.getFabricationYear());
        vehicle.setModelYear(vehicle.getModelYear());
        vehicle.setMotorType(vehicle.getMotorType());
        vehicle.setColor(vehicle.getColor());
        vehicle.setLicensePlate(vehicle.getLicensePlate());
        return repo.save(vehicle);
    }

    @PutMapping("/{id}")
    public Vehicle edit(@PathVariable Long id, 
        @Valid @RequestBody Vehicle vehicle){
        vehicle.setId(id);
        vehicle.setBrand(vehicle.getBrand());
        vehicle.setModel(vehicle.getModel());
        vehicle.setFabricationYear(vehicle.getFabricationYear());
        vehicle.setModelYear(vehicle.getModelYear());
        vehicle.setMotorType(vehicle.getMotorType());
        vehicle.setColor(vehicle.getColor());
        vehicle.setLicensePlate(vehicle.getLicensePlate());
        return repo.save(vehicle);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
