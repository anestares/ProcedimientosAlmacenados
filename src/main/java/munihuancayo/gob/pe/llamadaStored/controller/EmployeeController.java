package munihuancayo.gob.pe.llamadaStored.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import munihuancayo.gob.pe.llamadaStored.domain.Employees;
import munihuancayo.gob.pe.llamadaStored.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
	
	 @Autowired
	 private EmployeeRepository employeeRepository;
	 
	 @RequestMapping(value = "/listar", method = RequestMethod.GET)
	 public ResponseEntity<List<Employees>> getAllEmployees() {
		 Iterable<Employees> employees = employeeRepository.getAllEmployees();
		 
		 List<Employees> target = new ArrayList<>();
		 employees.forEach(target::add);
		 return new ResponseEntity<>(target, HttpStatus.OK);
	 }
	 	 
	 /**	@GetMapping("/ver/{id}")
		public Producto detalle(@PathVariable Long id) {
			return productoService.findById(id);
		} **/
				
	 @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	 public ResponseEntity<Employees> getAllEmployeeById(@PathVariable(name = "id") long id) {
		 
		Optional<Employees> one = employeeRepository.findById(id);		 
		return new ResponseEntity<Employees>(HttpStatus.OK);
		 //return employeeRepository.findById(id);
		 
	 }

}
