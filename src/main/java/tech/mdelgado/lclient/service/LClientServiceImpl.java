package tech.mdelgado.lclient.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.mdelgado.lclient.model.Client;
import tech.mdelgado.lclient.repository.LClientRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class LClientServiceImpl implements LClientService{

    @Autowired
    LClientRepository lClientRepository;

    @Override
    public List<Client> getAllClient() {
        List<Client> clientList;
        try {
            clientList = lClientRepository.findAll();
            log.info("GetAllClient : {}", clientList.toString());
        } catch (Exception ex){
            log.error("Error GetAllClient", ex);
            clientList = new ArrayList<>();
        }
        return clientList;
    }
}
