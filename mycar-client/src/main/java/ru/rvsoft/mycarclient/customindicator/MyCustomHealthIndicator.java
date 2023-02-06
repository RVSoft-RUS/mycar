package ru.rvsoft.mycarclient.customindicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("renamedMyCustomHealthIndicator")
//по умолчанию myCustom, меняем на renamedMyCustom
public class MyCustomHealthIndicator implements HealthIndicator {
    private final ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();

    @Override
    public Health health() {
        int code = threadLocalRandom.nextInt(2);
        if (code != 0) {
            return Health.down().withDetail("Error Code", code).build();
        }
        return Health.up().build();
    }
}
