public abstract class FiguraGeometrica {
    public abstract double area ();
    public abstract double perimetro();
}

class Circulo extends FiguraGeometrica {
    int radio;
    Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*(radio);
    }
}

class Rentangulo extends FiguraGeometrica {
    int base;
    int altura;

    Rentangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (2*base)+(2*altura);
    }
}

class Cuadrado extends FiguraGeometrica {
    int lado;

    Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return lado*lado;
    }

    @Override
    public double perimetro() {
        return (4*lado);
    }
}

class Triangulo extends FiguraGeometrica{
    int base;
    int altura;
    public Triangulo (int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public double calcularHipotenusa (){
        return Math.pow((base*base)+(altura*altura),0.5);
    }

    @Override
    public double area() {
        return ((base*altura)/2);
    }

    @Override
    public double perimetro() {
        return Math.pow((base*base)+(altura*altura),0.5);
    }
}

class TrianguloRectangulo extends Triangulo {
    public TrianguloRectangulo(int base, int altura) {
        super(base, altura);
    }

    @Override
    public double calcularHipotenusa() {
        return super.calcularHipotenusa();
    }

    @Override
    public double area() {
        return super.area();
    }

    @Override
    public double perimetro() {
        return super.perimetro();
    }
}

class prueba {
    public static void main(String[] args) {
        Circulo figura1=new Circulo(2);
        Rentangulo figura2=new Rentangulo(1,2);
        Cuadrado figura3=new Cuadrado(3);
        TrianguloRectangulo figura4=new TrianguloRectangulo(3,5);
        System.out.println("El area del circulo es: "+figura1.area());
        System.out.println("El perimetro del Circulo es: "+figura1.perimetro());
        System.out.println();
        System.out.println("El area del rectangulo es: "+figura2.area());
        System.out.println("El perimetro del rectangulo es. "+figura2.perimetro());
        System.out.println();
        System.out.println("El area del cuadrado es: "+figura3.area());
        System.out.println("El perimetro del cuadrado es: "+figura3.perimetro());
        System.out.println();
        System.out.println("El area del triangulo es: "+figura4.area());
        System.out.println("El perimetro del triangulo es: "+figura4.perimetro());
        System.out.println();
        
    }
}