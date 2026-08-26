package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EjemploController {

    int[] edades = new int[7];

    @GetMapping("/")
    public String hola() {
        return "hola hija";
    }

    @GetMapping("/edades")
    public int[] getEdades() {
        edades[0] = 19;
        edades[1] = 18;
        edades[2] = 17;
        edades[3] = 16;
        edades[4] = 15;
        edades[5] = 14;
        edades[6] = 13;
        return edades;
    }

    @GetMapping("/agregarEdad/{edadNueva}")
    public int[] agregarEdad(@PathVariable int edadNueva) {
        int[] edadesExtendido = new int[edades.length + 1];

        for (int i = 0; i < edades.length; i++) {
            edadesExtendido[i] = edades[i];
        }

        edadesExtendido[edades.length] = edadNueva;
        return edadesExtendido;
    }
}
