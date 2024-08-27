package SprintFinalM4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente();
    }

    @Test
    void testSetRut() {
        cliente.setRut("12.345.678-9");
        assertEquals("12.345.678-9", cliente.getRut());
    }

    @Test
    void testSetNombres() {
        cliente.setNombres("Juan Pablo");
        assertEquals("Juan Pablo", cliente.getNombres());
    }

    @Test
    void testSetApellidos() {
        cliente.setApellidos("González");
        assertEquals("González", cliente.getApellidos());
    }

    @Test
    void testSetEdadValida() {
        cliente.setEdad(25);
        assertEquals(25, cliente.getEdad());
    }

    @Test
    void testSetEdadInvalida() {
        assertThrows(IllegalArgumentException.class, () -> cliente.setEdad(200));
    }

    
}

