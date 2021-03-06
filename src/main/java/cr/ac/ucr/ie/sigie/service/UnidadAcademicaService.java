package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.repository.UnidadAcademicaRepository;

import java.util.List;

@Service
@Transactional
public class UnidadAcademicaService {

    @Autowired
    private UnidadAcademicaRepository repository;

    public List<UnidadAcademica> listAll() {
        return repository.findAll();
    }

    public void save(UnidadAcademica unidadAcademica) {
        repository.save(unidadAcademica);
    }

    public UnidadAcademica get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
