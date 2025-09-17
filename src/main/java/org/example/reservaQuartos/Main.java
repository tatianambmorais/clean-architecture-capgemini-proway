package org.example.reservaQuartos;

import org.example.listagemFuncionario.useCases.ListarFuncionarioUseCase;
import org.example.reservaQuartos.controller.CadastrarQuartoController;
import org.example.reservaQuartos.controller.ListarQuartoController;
import org.example.reservaQuartos.controller.ReservarQuartoController;
import org.example.reservaQuartos.repository.QuartoRepository;
import org.example.reservaQuartos.repository.QuartoRepositoryEmMemoria;
import org.example.reservaQuartos.useCases.CadastrarQuartoUseCase;
import org.example.reservaQuartos.useCases.ListarQuartosUseCase;
import org.example.reservaQuartos.useCases.ReservarQuartoUseCase;

public class Main {
    public static void main(String[] args) {
       QuartoRepository repository = new QuartoRepositoryEmMemoria();
        CadastrarQuartoUseCase cadastrarQuartoUseCase = new CadastrarQuartoUseCase(repository);
        CadastrarQuartoController cadastrarQuartoController = new CadastrarQuartoController(cadastrarQuartoUseCase);

        cadastrarQuartoController.cadastrarQuartoUseCase(101L, "Solteiro", false);
        cadastrarQuartoController.cadastrarQuartoUseCase(102L, "Casal", true);

        ListarQuartosUseCase listarQuartosUseCase = new ListarQuartosUseCase(repository);
        ListarQuartoController controller = new ListarQuartoController(listarQuartosUseCase);
        controller.listarQuartoUseCase();


        ReservarQuartoUseCase reservarQuartoUseCase = new ReservarQuartoUseCase(repository);
        ReservarQuartoController reservarQuartoController = new ReservarQuartoController(reservarQuartoUseCase);
        reservarQuartoController.reservarQuartoUseCase(101L);
        reservarQuartoController.reservarQuartoUseCase(101L);




    }
}
