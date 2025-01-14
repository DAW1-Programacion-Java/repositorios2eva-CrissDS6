package ejercicio3;

public class Ejercicio3Test {
    public static void main(String[] args) {
        double [] miCoord = {-6.4572000,38.4447100};
        Taxi taxi1 = new Taxi("1234MTT",Distrito.ESTE,TipoMotor.DIESEL,miCoord);
        Taxi taxi2 = new Taxi("5555CCC",Distrito.NORTE,TipoMotor.GASOLINA);

        System.out.println(taxi1.toString());
        System.out.println(taxi2.toString());

        System.out.println(taxi1.operanDistrito(taxi2));
    }
}
