package Profesores;

public class Profesor {
    protected void imprimir(){
        System.out.println("Es un profesor");
    }
}

class profesorTitular extends Profesor {
    protected void imprimir(){
        System.out.println("Es profesor titular");
    }
}

class prueba2{
    public static void main(String[] args) {
     profesorTitular objeto= new Profesor();
        objeto.imprimir();
    }
}
