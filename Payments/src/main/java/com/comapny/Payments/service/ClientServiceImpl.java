package com.comapny.Payments.service;

import com.comapny.Payments.entity.Client;
import com.comapny.Payments.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client getById(Long id) {
        Optional<Client> op = clientRepository.findById(id);
        return op.orElse(new Client());
    }

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }
}
