package jfleming.teamcitytest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.junit.Assert.fail;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class TeamcityTestApplicationTests {

    @Test
    void contextLoads() {
        fail();
    }

}
