package jfleming.teamcitytest;

import org.springframework.boot.SpringApplication;

public class TestTeamcityTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(TeamcityTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
