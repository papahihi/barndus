package di_p;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface FunService {
	void execute(HttpServletRequest request, HttpServletResponse response);
}
