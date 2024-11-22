package dev.darsaras.examen.prueba;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PruebaService {
    
    public ResponseEntity<List<Prueba>> getPruebas(){
        var pruebas = new ArrayList<Prueba>();
        for (int i=0; i < 10; i++){
            pruebas.add(new Prueba(i, "Name", "Description"));
        }
        return ResponseEntity.status(HttpStatus.OK).body(pruebas);
    }

}
