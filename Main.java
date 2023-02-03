public class Main {
    public static void main(String[] args) {

    Persona unaPersona = new Persona();
    unaPersona.setEdad(50);
    System.out.println(unaPersona.getEdad());

    unaPersona.setNombre("Pepe");
    System.out.println(unaPersona.getNombre());

    unaPersona.setTelefono("315245896");
    System.out.println(unaPersona.getTelefono());

    }

}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

}

