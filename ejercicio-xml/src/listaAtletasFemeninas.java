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

@JacksonXmlRootElement(localName = "atletafemeninas")
public class listaAtletasFemeninas {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "atletafemeninas")
    private List<AtletaFemenina> atletaFemeninas;

    public void setAtletaFemeninas(List<AtletaFemenina> atletaFemeninas) {
        this.atletaFemeninas = atletaFemeninas;
    }

    @Override
    public String toString() {
        return "listaAtletasFemeninas{" +
                "atletas Femeninas=" + atletaFemeninas +
                '}';
    }
}