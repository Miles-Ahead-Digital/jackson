package milesahead.jackson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JacksonController {

    @GetMapping("/jackson")
    public Jackson jackson() {
        return new Jackson();
    }
}
