import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class AtletaFemeninaMain {
    public static void main(String[] args) {
        AtletaFemenina atleta1 = new AtletaFemenina("Atleta1", 25, "País1", Arrays.asList("Deporte1", "Deporte2"));
        AtletaFemenina atleta2 = new AtletaFemenina("Atleta2", 28, "País2", Arrays.asList("Deporte3", "Deporte4"));

        List<AtletaFemenina> atletas = Arrays.asList(atleta1, atleta2);
        escribirXML(atletas, "atletas_femeninas.xml");
        List<AtletaFemenina> atletasLeidas = leerXML("atletas_femeninas.xml");

        System.out.println("Atletas leídas del archivo XML:");
        atletasLeidas.forEach(System.out::println);
    }

    private static void escribirXML(List<AtletaFemenina> atletas, String nombreArchivo) {
        ObjectMapper mapper = new XmlMapper();
        listaAtletasFemeninas lista = new listaAtletasFemeninas(atletas);

        try {
            mapper.writeValue(new File(nombreArchivo), lista);
            System.out.println("Archivo XML escrito correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<AtletaFemenina> leerXML(String nombreArchivo) {
        ObjectMapper mapper = new XmlMapper();

        try {
            listaAtletasFemeninas lista = mapper.readValue(new File(nombreArchivo), listaAtletasFemeninas.class);
            return lista.getAtletaFemeninas();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
