package io.github.saifulislamniloy.springlab.vault.hashicorp.central_secret_management.service1.log;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class LogServiceImpl implements LogService {
    private final LogRepository logRepository;

    @Override
    public Log createLog() {
        Log log = new Log();
        log.setMessage("Service 1");
        log.setCreatedAt(Instant.now());
        return logRepository.save(log);
    }
}
