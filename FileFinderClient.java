package ClientFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;
import javax.xml.ws.Service;

import test2.FileFInder;
import test2.FileFinderImpl;

public class FileFinderClient {
	public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8086/fileFinder?wsdl");
        QName qname = new QName("http://test2/", "FileFinderImplService");
        Service service = Service.create(url, qname);
        FileFInder fileFinder = service.getPort(FileFInder.class);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path:");
        String path = scanner.nextLine();
        System.out.println("Enter the file name:");
        String fileName = scanner.nextLine();

        System.out.println(fileFinder.findFile(path, fileName));
    }
}
