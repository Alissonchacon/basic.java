package casaque;

public class main {
    public static void main(String[] args) {
        String ciudad;
        String barrio;
        String color;
        int pisos;
        int habitaciones;
        int banos;
        int cocinas;
        Casaque casa= new Casaque("Bogota","Bochica","Azul");
        Casaque casa2= new Casaque("Villa del rio","Rosado",3);
        Casaque casa3= new Casaque(3,5,2,1);
        
        casa.Mostrarinfo();
        System.out.println("");
        casa2.Mostrarinfo();
        System.out.println("");
        casa3.Mostrarinfo();
        /*casa.setCiudad("Bogota");
        casa.setBarrio("Bochica");
        casa.setColor("Azul");
        casa.setPisos(3);
        casa.setBanos(2);
        casa.setHabitaciones(3);
        casa.setCocinas(1);*/
        
        
        
    }
}
