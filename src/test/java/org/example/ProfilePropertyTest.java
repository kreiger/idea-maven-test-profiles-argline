package org.example;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProfilePropertyTest {

    @Test
    public void testProperties() {
        String optionalProperty = System.getProperty("optionalProperty");
        String requiredProperty = System.getProperty("requiredProperty");

        System.out.println("optionalProperty: "+ optionalProperty);
        System.out.println("requiredProperty: "+ requiredProperty);

        assertNotNull(requiredProperty);
    }
}
