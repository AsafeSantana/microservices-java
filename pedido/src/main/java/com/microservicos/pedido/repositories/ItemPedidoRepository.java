package com.microservicos.pedido.repositories;

import com.microservicos.pedido.model.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Long> {
}
