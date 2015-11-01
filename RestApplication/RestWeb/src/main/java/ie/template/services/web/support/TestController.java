package ie.template.services.web.support;

import java.sql.Timestamp;
import java.util.Date;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ie.template.services.domain.support.TestModel;
import ie.template.services.support.HomeServices;

/**
 * Handles requests for the application test restful services.
 */
@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Inject
	public HomeServices homeServices;
	
	@RequestMapping(value = "/testservice", method = RequestMethod.GET)
	public @ResponseBody TestModel homeService() {
		logger.info("homeService");
		return homeServices.getTestModelDetails();
		 
	}

}
