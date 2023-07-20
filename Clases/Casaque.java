
package casaque;

public class Casaque {
 
    public String ciudad;
    public String barrio;
    public String color;
    public int pisos;
    public int habitaciones;
    public int banos;
    public int cocinas;

    public Casaque(String ciudad, String barrio, String color){
    
        this.ciudad=ciudad;
        this.barrio=barrio;
        this.color=color;
        
    }
    public Casaque(String barrio, String color, int pisos ){
            
        this.barrio=barrio;
        this.color=color;
        this.pisos=pisos;
    }
    public Casaque(int pisos, int habitaciones, int banos, int cocinas){
        this.pisos=pisos;
        this.habitaciones=habitaciones;
        this.banos=banos;
        this.cocinas=cocinas;
    }

    public String getCiudad(){
        return ciudad;
    }
    public String getBarrio() {
        return barrio;
    }
    public String getColor() {
        return color;
    }
    public int getPisos() {
        return pisos;
    } 
    public int getHabitaciones() {
        return habitaciones;
    }
    public int getBanos() {
        return banos;
    }
    public int getCocinas() {
        return cocinas;
    }

    public void Mostrarinfo(){
        System.out.println("DESCRIPCION DE LA CASA");
        System.out.println("La casa esta en la ciudad de "+ciudad);
        System.out.println("Esta ubicada en el barrio "+barrio);
        System.out.println("Color de la casa "+color);
        System.out.println("Cantidad de pisos "+pisos);
        System.out.println("Cantidad de baños "+banos);
        System.out.println("Cantidad de habitaciones "+ habitaciones);
        System.out.println("Cantidad de cocinas "+cocinas);
    }
    
    }
