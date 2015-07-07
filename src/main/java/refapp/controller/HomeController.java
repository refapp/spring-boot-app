package refapp.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home controller
 */
@RestController
public class HomeController
{
	private static final String CONTEXT_TYPE = "context_type";
	private static final String CONTEXT_NAME = "context_name";
	
	/**
	 * Home method
	 * @return String Json
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getHome()
	{
		return "Hello World";
	}
	
	@RequestMapping(value="{" + CONTEXT_TYPE + "}/{" + CONTEXT_NAME + ":.+}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String processContext(@PathVariable(CONTEXT_TYPE) String contextType, @PathVariable(CONTEXT_NAME) String contextName)
	{
		return "CONTEXT TYPE : " + contextType + ", CONTEXT NAME : " + contextName;
	}
}