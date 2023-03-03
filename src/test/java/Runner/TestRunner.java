package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\I.Xhahili\\IdeaProjects\\INPS\\src\\test\\resources\\features",
        glue= {"Step_Definitions"},
        plugin = { "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",},
        monochrome = true,
        tags = "@CarateriSpeziali"
       // publish = false
       // @Ricerca
        // @LavoroINPS
        // @zerobank
       // @RicercaTestNegativo
      //  @CarateriSpeziali

)

public class TestRunner {

}
