package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1,"Juan","García",1000);
        Empleado empleado2 = new Empleado(2,"Ramón", "Otro",1200);

        System.out.println(empleado1);
        System.out.println(empleado2);

        System.out.println(empleado1.getNombreCompleto());
        System.out.println(empleado2.getNombreCompleto());

        System.out.println(empleado1.getSalarioAnual());
        System.out.println(empleado2.getSalarioAnual());

        empleado1.incrementaSalario(30);
        empleado2.incrementaSalario(20);
        System.out.println(empleado1.getSalarioAnual());
        System.out.println(empleado2.getSalarioAnual());
    }
}
