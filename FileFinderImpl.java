package test2;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.jws.WebService;

@WebService(endpointInterface = "test2.FileFInder")
public class FileFinderImpl implements FileFInder {

	@Override
	public String findFile(String path, String fileName) {
        Path dirPath = Paths.get(path);
        try {
            return Files.walk(dirPath)
                    .filter(p -> p.getFileName().toString().equals(fileName))
                    .findFirst()
                    .map(Path::toString)
                    .orElse("File not found");
        } catch (Exception e) {
            return "Error occurred: " + e.getMessage();
        }
    }
	

}
