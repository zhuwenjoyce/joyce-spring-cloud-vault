package hello;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author: Joyce Zhu
 * @date: 2021/1/26
 */
@Slf4j
@RestController
public class MyController {

    @Autowired
    private MyConfiguration configuration;

    @RequestMapping(value = "/vault/values")
    public Map<String, Object> tt() {
        log.info("----------------------------------------");
        log.info("Configuration properties.");
        log.info("		example.username is {}", configuration.getUsername());
        log.info("		example.password is {}", configuration.getPassword());
        log.info("----------------------------------------");
        return Map.of("status", "OK");
    }

}
