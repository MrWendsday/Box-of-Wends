import java.nio.file.*;
import java.util.List;
import java.nio.charset.StandardCharsets;
import java.io.IOException;

public class ReadANovel {
	public static void main(String[] args) throws IOException
	{
		List<String> lines = 
			Files.readAllLines(Paths.get("mobydick.txt"), StandardCharsets.US_ASCII);
		System.out.println("Read " + lines.size() + " lines of text.");

		
	}
}