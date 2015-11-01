package ie.template.services.support;

import java.sql.Timestamp;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ie.template.services.domain.support.TestModel;

@Service
public class HomeServices {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeServices.class);
	
	
	public TestModel getTestModelDetails() {
		logger.info("getTestModelDetails");
		TestModel model = new TestModel();
		Date d = new Date();
		model.setCreatedAt(new Timestamp(d.getTime()));
		model.setModelName("TestModel");
		model.setCreatedBy("TestUser");
		return model;
	}

}
