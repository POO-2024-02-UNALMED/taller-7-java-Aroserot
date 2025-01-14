package comunicacion;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    
    public int cantidadLetras() {
        return (letras != null) ? letras.length : 0;
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
    public String toString() {
        return Arrays.stream(letras)
                     .collect(Collectors.joining(", "));
    }
}
