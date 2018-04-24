package org.basseme.salamtek.cucumber.stepdefs;

import org.basseme.salamtek.SalamtekApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SalamtekApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
