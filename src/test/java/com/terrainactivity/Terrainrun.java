package com.terrainactivity;
import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class) 
@Cucumber.Options(
		//features={"com.terrainactivity/Terrain.feature"},
		//glue= {"TerrainStepDefinition"},
		tags= {"@SmokeTest"},
		
		dryRun= false,
		monochrome=true,
		
	format = {"pretty", "html:target/cucumber"}) 

public class Terrainrun {

}
