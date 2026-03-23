package repositories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<models.PedidoModel, Long> {

}
