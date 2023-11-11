package test2;

import javax.xml.ws.Endpoint;

public class FIleFinderPublisher {
	public static void main(String[] args) {
		String url = "http://localhost:8086/fileFinder";
		Endpoint.publish(url,new FileFinderImpl());
		System.out.println("Server is running .... , Service deployed avec sucees ");
	}
}
