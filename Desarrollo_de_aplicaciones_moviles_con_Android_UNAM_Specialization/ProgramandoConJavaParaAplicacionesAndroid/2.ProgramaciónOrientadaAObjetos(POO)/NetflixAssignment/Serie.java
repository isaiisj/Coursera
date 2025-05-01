public class Serie extends Producto implements Visualizable{

    int numTemporadas = 1;

    public Serie(){
        super();
    }

    public Serie(String titulo, String creador){
        this.setTitulo(titulo);
        this.setCreador(creador);
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador,int anio, int duracion){
        this.setTitulo(titulo);
        this.setNumTemporadas(numTemporadas);
        this.setGenero(genero);
        this.setCreador(creador);
        this.setAnio(anio);
        this.setDuracion(duracion);
    }

    public int getNumTemporadas(){
        return this.numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas){
        this.numTemporadas = numTemporadas;
    }
    @Override
    public String toString() {
        return getCreador() + isVisto();
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
