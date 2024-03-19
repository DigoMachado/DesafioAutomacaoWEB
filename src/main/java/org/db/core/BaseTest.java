package org.db.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


public class BaseTest extends DriverManager{




    @BeforeEach
    public void SetUp()
    {
        getDriver().get(Paths.BASE_URL);
    }



    @AfterEach
    public void tearDown() throws Exception
    {
        Thread.sleep(5000);
        quitDriver();
    }
}
