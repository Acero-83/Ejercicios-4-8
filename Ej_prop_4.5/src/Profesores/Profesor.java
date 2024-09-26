package Profesores;

public class Profesor {
    protected void imprimir (){
        System.out.println("Es profesor");
    }
}
class ProfesorTitular extends Profesor {
    protected void imprimir (){
        System.out.println("Es profesor titular");
    }
}

class prueba3 {
    public static void main(String[] args) {
        Profesor profesor1 = new ProfesorTitular();
        ProfesorTitular profesor2= (ProfesorTitular) profesor1;
        profesor2.imprimir();
    }
    }

