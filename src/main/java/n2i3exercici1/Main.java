package n2i3exercici1;


import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import n2i3exercici1.classes.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        Treballador treballador = new Treballador("Josep", "Garcia", 20);
        Path destination = Path.of(treballador.getClass().getAnnotation(JSONSerializable.class).destinationPath()).resolve("treballador.json");
        ObjectMapper mapper = new ObjectMapper();

        try (BufferedWriter writer = Files.newBufferedWriter(destination)){
            writer.write(mapper.writeValueAsString(treballador));
        } catch (IOException e) {
            System.err.println("IOException: couldn't write to file");
            e.printStackTrace();
        }
    }
}