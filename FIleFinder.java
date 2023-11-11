package test2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface FileFInder {
	@WebMethod
    String findFile(@WebParam(name = "path") String path, @WebParam(name = "fileName") String fileName);
}
