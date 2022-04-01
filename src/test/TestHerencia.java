package test;

import domain.Cliente;
import domain.Empleado;
import java.sql.Date;

public class TestHerencia {
    public static void main(String[] args) {
        //Empleado empleado1 = new Empleado("Juan", 5000.00);
        //System.out.println("empleado1 = " + empleado1);
        var fecha = new Date(2021-02-01);
        Cliente cliente1 = new Cliente(fecha, true, "karla", 'F', 28, "Saturno 15");
        System.out.println("cliente1 = " + cliente1);
    }
}
