package org.smart.demo;

import org.jsmart.zerocode.core.domain.Scenario;
import org.jsmart.zerocode.core.domain.TargetEnv;
import org.jsmart.zerocode.core.runner.ZeroCodeUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ZeroCodeUnitRunner.class)
@TargetEnv("local.host.properties")
public class HelloWorld {

    @Test
    @Scenario("helloworld/demohelloworld.json")
    public void testHelloWorld() throws Exception{

    }

}
