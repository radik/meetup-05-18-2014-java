import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

class ReadFile8 {
	public static void main(String[] args) throws IOException {
		try (Stream st = Files.lines(Paths.get("file_utf8.txt"))) {
     		st.forEach(System.out::println);
 		}
	}
}