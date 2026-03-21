package com.jp.gerenciamento_de_pedidos.services;

import com.jp.gerenciamento_de_pedidos.models.PedidoModel;
import com.jp.gerenciamento_de_pedidos.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoModel criarPedido(PedidoModel pedido){
        return pedidoRepository.save(pedido);
    }

    public List<PedidoModel> listarPedidos(){
        return pedidoRepository.findAll();
    }

    public void deletarPedido(Long id){
        pedidoRepository.deleteById(id);
    }

    public PedidoModel listarPedidoPorId(Long id){
        return pedidoRepository.findById(id).get();
    }


}
