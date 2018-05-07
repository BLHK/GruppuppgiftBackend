package se.group.backendgruppuppgift.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import se.group.backendgruppuppgift.resource.UserResource;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        packages("se.group.backendgruppuppgift.resource");

    }
}
