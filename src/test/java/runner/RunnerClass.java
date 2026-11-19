package runner;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("LoginWithDataDriven.feature")
@ConfigurationParameter(
		key="cucumber.glue",
		value="stepDefinition"
		)

public class RunnerClass {

}
