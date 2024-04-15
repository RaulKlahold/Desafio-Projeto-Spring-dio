package Dio.projeto.Desafio_Projeto_Dio.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface enderecoRepository extends CrudRepository<Endereco, String> {

}