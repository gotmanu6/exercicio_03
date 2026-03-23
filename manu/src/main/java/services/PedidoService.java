package services;

import models.PedidoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import repositories.PedidoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoService pedidoRepository;

    public List<PedidoModel> findAll() {
        return pedidoRepository.findAll();
    }

    public PedidoModel criarPedido(PedidoModel pedidoModel) {
        return pedidoRepository.criarPedido(pedidoModel);
    }

    public Optional<PedidoModel> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    public PedidoModel atualizar(Long id, PedidoModel pedidoModel) {
        PedidoModel model = pedidoRepository.findById(id).get();
        model.setData(pedidoModel.getData());
        model.setValorTotal(pedidoModel.getValorTotal());
        model.setStatus(pedidoModel.getStatus());
        return pedidoRepository.atualizar(id, model);
    }

    public ResponseEntity<?> deletar(Long id) {
        pedidoRepository.deletar(id);
        return null;
    }
}