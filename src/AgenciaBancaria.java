import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

public class AgenciaBancaria {
    private UUID id;
    private List<ContaBancaria> contas;

    AgenciaBancaria() {
        this.id = UUID.randomUUID();
        this.contas = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    void adicionarConta(ContaBancaria conta) {
        this.contas.add(conta);
    }
}
