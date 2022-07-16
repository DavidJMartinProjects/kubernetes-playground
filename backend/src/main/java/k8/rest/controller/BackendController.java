package k8.rest.controller;

import k8.rest.model.Greeting;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping(BackendController.BASE_PATH_URL)

public class BackendController {

    public static final String BASE_PATH_URL = "/backend";
    public static final String GREETING_URL = "/greeting";

    @GetMapping(GREETING_URL)
    public Greeting getGreeting() {
        log.info("GET: " + BASE_PATH_URL + GREETING_URL);
        return Greeting.builder()
            .message("success: backend service is online.")
            .build();
    }

}
