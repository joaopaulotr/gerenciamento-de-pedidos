package com.jp.gerenciamento_de_pedidos.repositories;

import com.jp.gerenciamento_de_pedidos.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel,Long> {
}
