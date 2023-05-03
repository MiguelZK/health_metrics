package dev.ifrs;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.HealthCheckResponseBuilder;
import org.eclipse.microprofile.health.Liveness;

@Liveness
public class MyReadynessCheck implements HealthCheck{
    
    @Override
    public HealthCheckResponse call(){ 
    HealthCheckResponseBuilder response = HealthCheckResponse.named("Checagem se o sistema está funcionando");

    if(true){
        response.up().withData("Teste legal", "Deu certo").withData("Deu certo?", true);
    } else {
        response.down().withData("Deu errado?", true);
    }

    return response.build();
}
}
