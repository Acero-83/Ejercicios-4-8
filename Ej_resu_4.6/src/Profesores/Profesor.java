package Profesores;

public class Profesor {
    protected void imprimir (){
        System.out.println("Es un profesor");
    }
}

class ProfesorTitular extends Profesor {
    int años=0;
    protected void imprimir (){
        System.out.println("Es un profesor titular");
    }
    protected void imprimirAños (){
        System.out.println("Años= "+años);
    }
}

class Prueba3 {
    public static void main(String[] args) {
        Profesor profesor1=new ProfesorTitular();
        profesor1.imprimirAños();
    }
}
