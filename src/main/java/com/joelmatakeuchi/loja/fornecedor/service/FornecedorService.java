package com.joelmatakeuchi.loja.fornecedor.service;

import com.joelmatakeuchi.loja.fornecedor.model.Fornecedor;
import com.joelmatakeuchi.loja.fornecedor.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {


    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor cadastraFornecedor( Fornecedor fornecedor){
        fornecedorRepository.findByDocumento(fornecedor.getDocumento());


    }


}
