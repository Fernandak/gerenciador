package com.devinspira.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devinspira.cliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}