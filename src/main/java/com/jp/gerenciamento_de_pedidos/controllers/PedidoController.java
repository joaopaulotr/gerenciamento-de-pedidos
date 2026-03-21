package com.jp.gerenciamento_de_pedidos.controllers;

import com.jp.gerenciamento_de_pedidos.models.PedidoModel;
import com.jp.gerenciamento_de_pedidos.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<PedidoModel> listarPedidos(){
        return  pedidoService.listarPedidos();
    }

    @PostMapping
    public PedidoModel adicionarPedido(@RequestBody PedidoModel pedido){
        return pedidoService.criarPedido(pedido);
    }

    @DeleteMapping
    public void deletarPedido(@RequestParam Long id){
        pedidoService.deletarPedido(id);
    }

    @GetMapping
    public PedidoModel buscarProdutoId(@RequestParam Long id){
        return pedidoService.listarPedidoPorId(id);
    }

}
