public class Pelicula extends Producto implements Visualizable{

    public Pelicula(){
        super();
    }

    public Pelicula(String titulo, String creador){
        this.setTitulo(titulo);
        this.setCreador(creador);
    }

    public Pelicula(String titulo, String genero, String creador,int anio, int duracion){
        this.setTitulo(titulo);
        this.setGenero(genero);
        this.setCreador(creador);
        this.setAnio(anio);
        this.setDuracion(duracion);
    }


    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + "\n" +
                "Genero: " + getGenero() + "\n" +
                "Creador: " + getCreador() + "\n" +
                "Año: " + getAnio() + "\n" +
                "Duración: " + getDuracion() + " minutos";
    }

    @Override
    public void marcarVisto() {
        setVisto(true);
    }

    @Override
    public boolean esVisto() {
        return this.isVisto();
    }

    @Override
    public long tiempoVisto() {
        return getDuracion();
    }
}
