package comunicacion;

public class Fabula extends Escrito {
    private String ensenanzas;
    private String interpretacion;
    
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }
    
    public String getEnsenanza() { // Corrigiendo el nombre del método a getEnsenanza
        return ensenanzas;
    }

    public void setEnsenanza(String ensenanza) { // Corrigiendo el nombre del método a setEnsenanza
        this.ensenanzas = ensenanza;
    }
    
    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }
    
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return this.getPaginas() * palabrasPagina * 1; // Factor para Fabula es 1
    }
    
    @Override
    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.ensenanzas;
    }
}
