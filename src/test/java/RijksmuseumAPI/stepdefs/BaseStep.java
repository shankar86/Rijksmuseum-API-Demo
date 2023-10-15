package RijksmuseumAPI.stepdefs;

import org.apache.log4j.*;
import org.junit.Before;

import io.cucumber.java.Scenario;


public class BaseStep {
	
	static Logger log = Logger.getLogger(BaseStep.class.getName());
	public static String ScenarioName;

	@Before
	public void beforeScenario(Scenario scenario) {

		log.info("-------------NEW SCENARIO STARTED-----------------------");
		ScenarioName = scenario.getName();
		log.info("SCENARIO NAME : " + ScenarioName);
	}

}
