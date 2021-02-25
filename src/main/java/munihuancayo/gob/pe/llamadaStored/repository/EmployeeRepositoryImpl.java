package munihuancayo.gob.pe.llamadaStored.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import munihuancayo.gob.pe.llamadaStored.domain.Employees;

public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {
	@PersistenceContext
	 private EntityManager em;
	
	@Override
	 public List<Employees> getAllEmployees() {
	 StoredProcedureQuery findByYearProcedure =
			 	em.createNamedStoredProcedureQuery("getAllEmployees");
	 return findByYearProcedure.getResultList();
	 }

}
