package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
    CuentaCorriente cc1;
    CuentaCorriente cc2;

    @BeforeEach
    public void setup(){
        cc1 =new CuentaCorriente("Cuenta1", 123454321, 20000);
        cc2 =new CuentaCorriente("Cuenta2", 987656789, 20000);
    }

    /*
    @Test
    public void ingresoPositivo(){
        assertTrue.(cc1.deposit(10));
    }
    @Test
    public void ingresoNegativo(){
        assertFalse.(cc1.deposit(-10));
    }
    */



}
