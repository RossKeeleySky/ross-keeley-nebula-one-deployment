package uk.sky.deploymentsservice.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/private")
@RestController
public class PrivateController {
    @GetMapping("/status")
    ResponseEntity<String> status() {
        return ResponseEntity.ok("OK");
    }
}
