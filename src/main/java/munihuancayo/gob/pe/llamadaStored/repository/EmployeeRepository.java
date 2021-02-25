package munihuancayo.gob.pe.llamadaStored.repository;

import org.springframework.data.repository.CrudRepository;

import munihuancayo.gob.pe.llamadaStored.domain.Employees;

public interface EmployeeRepository extends CrudRepository<Employees, Long>, EmployeeRepositoryCustom  {

}
