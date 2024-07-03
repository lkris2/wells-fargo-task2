package com.wellsfargo.counselor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.data.annotation.Id;


import java.util.List;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String name;
    private String email;

    private List<IntegrationProperties.RSocket.Client> clients;

    public FinancialAdvisor() {}

    public FinancialAdvisor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<IntegrationProperties.RSocket.Client> getClients() {
        return clients;
    }

    public void setClients(List<IntegrationProperties.RSocket.Client> clients) {
        this.clients = clients;
    }
}
