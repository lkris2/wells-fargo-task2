package com.wellsfargo.counselor.entity;



import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToMany(mappedBy = "portfolio", cascade = CascadeType.ALL)
    private List<Security> securities;

    public Portfolio() {}

    public Portfolio(Client client) {
        this.client = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}

