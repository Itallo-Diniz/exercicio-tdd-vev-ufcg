import org.example.Boleto;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ProcessadorBoletoTest extends Main {

    @Test
    public void verificaSeBoletosIniciaVazio() {
        ArrayList<Boleto> boletos = new ArrayList<Boleto>();
        Assertions.assertEquals(0,  boletos.size());
    }
}