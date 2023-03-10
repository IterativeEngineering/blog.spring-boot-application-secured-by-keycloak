package engineering.iterative.appkeycloaksecured.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AccountController {

    @GetMapping("/api/account")
    public Principal getOrange(Principal principal) {
        return principal;
    }
}
