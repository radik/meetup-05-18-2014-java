import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

class ReadFile {
    public static void main(String[] args){
        Charset charset = Charset.forName("UTF-8");
        Path file = Paths.get(args[0]);
        try (BufferedReader reader = Files.newBufferedReader(file, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}