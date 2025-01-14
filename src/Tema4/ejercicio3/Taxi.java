package ejercicio3;
/*Diseña un programa Java que guarde información sobre los taxis de una compañía.
De cada taxi debe guardarse la matrícula, distrito en el que opera (sur, norte, oeste…),
tipo motor (diesel o gasolina) y coordenadas (latitud y longitud por separado) en las
que se ubica. Crea la clase necesaria y añade métodos get/set, dos constructores
(uno con todos los atributos y otro sin coordenadas, poner a 0). Diseña otro método
que servirá para comprobar si dos taxis operan en el mismo distrito devolviendo true
o false. Este método recibirá un taxi como parámetro. Añade un nuevo método que
devuelva un String con las coordenadas en conjunto. Crea dos objetos Taxi y prueba
sus métodos.*/
public class Taxi {
    //ATRIBUTOS
    private String matricula;
    //private String distrito;//norte, sur, este, oeste
    //private String motor;//diesel, gasolina
    private Distrito distrito;
    private TipoMotor motor;
    private double [] coordenadas;

    //CONSTRUCTORES
    public Taxi(String matricula, Distrito distrito, TipoMotor motor, double [] coordenadas ){
        this.matricula = matricula;
        this.distrito = distrito;
        this.motor = motor;
        this.coordenadas= coordenadas;
    }

    public Taxi(String matricula, Distrito distrito, TipoMotor motor){
        this.matricula = matricula;
        this.distrito =  distrito;
        this.motor =  motor;
        this.coordenadas = new double []{0.0f,0.0f};
    }

    //GUETTER SETTER


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    public TipoMotor getMotor() {
        return motor;
    }

    public void setMotor(TipoMotor motor) {
        this.motor = motor;
    }

    public double[] getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(double[] coordenadas) {
        this.coordenadas = coordenadas;
    }

    //MÉTODOS

    public boolean operanDistrito(Taxi otro_taxi){
        return this.distrito.equals(otro_taxi.getDistrito()); //Si el distrito del objeto en el que estoy es igual
                                                            //al que me pasan por parámetro, devuelve true.
    }

    public String coordenadasTostring(){
        return "Longitud :" + coordenadas[0] + ". Latitud: " + coordenadas[1];//para convertir el array en String
    }

    @Override

    public String toString(){
        return "Matricula: " + matricula + "\nDistrito: " + distrito
                + "\nMotor: " + motor + "\nCoordenadas: " + coordenadasTostring();
    }
}
