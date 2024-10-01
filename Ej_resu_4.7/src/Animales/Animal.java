package Animales;

public abstract class Animal {
    protected String sonido;
    protected String alimentos;
    protected String habitat;
    protected String nombreCientifico;

 public abstract String getNombreCientifico();
    public abstract String getSonido();
    public abstract String getHabitat();
    public abstract String getAlimentos();
}

abstract class  Canido extends Animal {
}

class Perro extends Canido {
    @Override
    public String getSonido() {
        return "Ladrido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoros";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus familiaris";
    }
}

class Lobo extends Canido {
    @Override
    public String getSonido() {
        return "Aullido";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getHabitat() {
        return "Bosque";
    }

    @Override
    public String getNombreCientifico() {
        return "Canis lupus";
    }
}

abstract class Felino extends Animal {
}

class Leon extends Felino {
    @Override
    public String getSonido() {
        return "Rugido";
    }

    @Override
    public String getHabitat() {
        return "Praderas";
    }

    @Override
    public String getAlimentos() {
        return "Carnivoro";
    }

    @Override
    public String getNombreCientifico() {
        return "Panthera leo";
    }
}

class Gato extends Felino {
    @Override
    public String getSonido() {
        return "Maullido";
    }

    @Override
    public String getHabitat() {
        return "Domestico";
    }

    @Override
    public String getAlimentos() {
        return "Ratones";
    }

    @Override
    public String getNombreCientifico() {
        return "Felis silvestris catus";
    }
}

class Prueba {
    public static void main(String[] args) {
        Animal [] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (int i=0;i< animales.length;i++){
            System.out.println(animales[i].nombreCientifico);
            System.out.println("Sonido: "+animales[i].sonido);
            System.out.println("Alimentos: "+animales[i].alimentos);
            System.out.println("Habitat: "+animales[i].habitat);
        }
    }
}