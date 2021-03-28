package com.comapny.Payments.controller;

import com.comapny.Payments.entity.Client;
import com.comapny.Payments.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public List<Client> getAll() {
        return clientService.getAll();
    }

    @GetMapping({"/{id}"})
    public List<Client> getById(@PathVariable("id") Long id) {
        return clientService.getAll();
    }

    @PostMapping
    public Client save(@RequestBody Client client) {
        return clientService.save(client);
    }
}
