import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@JacksonXmlRootElement(localName = "atletaFemenina")
public class AtletaFemenina {
    @JacksonXmlProperty(isAttribute = true)
    private String nombre;
    private int edad;
    private String pais;
    @JacksonXmlElementWrapper(localName = "atletasFemeninas")
    @JacksonXmlProperty(localName = "atletaFemenina")
    private List<String> prueba;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setPrueba(List<String> prueba) {
        this.prueba = prueba;
    }

    @Override
    public String toString() {
        return "atletasFemeninas{" +
                "nombre='" + nombre + '\'' +
                ", prueba=" + prueba +
                ", edad=" + edad +
                ", pais=" + pais +
                '}';
    }
}