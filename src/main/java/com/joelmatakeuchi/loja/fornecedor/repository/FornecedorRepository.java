package com.joelmatakeuchi.loja.fornecedor.repository;

import com.joelmatakeuchi.loja.fornecedor.model.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, UUID> {


    Fornecedor findByDocumento(String documento);
}
