import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProcessadorBoletoTest extends Main {

    @Test
    public void verificaSeBoletosIniciaVazio() {
        ArrayList<Boletos> boletos = new ArrayList<Object>();
        Assertions.assertEquals(0,  boletos.size());
    }
}