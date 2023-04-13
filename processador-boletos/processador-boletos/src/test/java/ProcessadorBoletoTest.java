import org.example.Boletos;
import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ProcessadorBoletoTest extends Main {

    @Test
    public void verificaSeBoletosIniciaVazio() {
        ArrayList<Boletos> boletos = new ArrayList<Boletos>();
        Assertions.assertEquals(0,  boletos.size());
    }
}