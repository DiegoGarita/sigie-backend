package cr.ac.ucr.ie.sigie.controller;

import cr.ac.ucr.ie.sigie.entity.ReferenciaBibliografica;
import cr.ac.ucr.ie.sigie.service.ReferenciaBibliograficaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/client")
public class ReferenciaBibliograficaController {

    @Autowired
    private ReferenciaBibliograficaService service;

    @GetMapping("/clients")
    public List<ReferenciaBibliografica> list() {
        return service.listAll();
    }

}
