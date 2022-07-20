package tech.mdelgado.lclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.mdelgado.lclient.model.Client;
import tech.mdelgado.lclient.service.LClientService;

import java.util.List;

@RestController
public class LClientController {

    @Autowired
    LClientService lClientService;

    @GetMapping("/listclientes")
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(lClientService.getAllClient());
    }
}
