package com.venta.venta.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.venta.dto.FacturaValorDTO;
import com.venta.venta.model.Factura;
import com.venta.venta.repository.FacturaRepository;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository personaRepository;

    public List<FacturaValorDTO> getFacturaValor(){
        return personaRepository.findAll().stream().map(this::convertirEntidadToDTO).collect(Collectors.toList());
    }

    private FacturaValorDTO convertirEntidadToDTO(Factura factura){
        FacturaValorDTO personaDireccionDTO = new FacturaValorDTO();
        personaDireccionDTO.setFacturaId(factura.getId());
        personaDireccionDTO.setValor(factura.getValor());
        // personaDireccionDTO.setLugar(persona.getDireccion().getLugar());
        // personaDireccionDTO.setDescripcion(persona.getDireccion().getDescripcion());
        return personaDireccionDTO;
    }

    public Factura create(Factura persona){
        return personaRepository.save(persona);
    }

    public List<Factura> listarFacturas(){
        return personaRepository.findAll();
    }

    public void eliminarFactura(Factura persona){
        personaRepository.delete(persona);
    }


    public Factura buscarId(Long id){
        return personaRepository.findById(id).get();
    }
}
