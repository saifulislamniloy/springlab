package io.github.saifulislamniloy.springlab.vault.hashicorp.central_secret_management.service2.log;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LogController {
    private final LogService logService;

    @PostMapping("/log")
    public ResponseEntity<Log> getTripType() {
        Log createdLog = logService.createLog();
        return ResponseEntity.ok(createdLog);
    }


}
