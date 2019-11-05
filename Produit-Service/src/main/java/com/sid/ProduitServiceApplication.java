package com.sid;

import com.sid.dao.ProduitRepository;
import com.sid.entities.Produit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.stream.Stream;
@EnableDiscoveryClient
@SpringBootApplication
public class ProduitServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProduitServiceApplication.class, args);
    }

    CommandLineRunner start(ProduitRepository produitRepository){
        return produits->{
            Stream.of("Disk Dur", "Imprimante", "Laptop", "Desktop", "Casque", "Clavier", "Souris", "PowerBank").forEach(
                    produit-> {
                        switch (produit){
                            case "Disk Dur":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((50 - 1) + 1)),(1 + (int)(Math.random() * ((50 - 1) + 1)))*700));
                                break;
                            case "Imprimante":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((20 - 1) + 1)),(1 + (int)(Math.random() * ((20 - 1) + 1)))*1800));
                                break;
                            case "Laptop":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((10 - 1) + 1)),(1 + (int)(Math.random() * ((10 - 1) + 1)))*9700));
                                break;
                            case "Desktop":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((10 - 1) + 1)),(1 + (int)(Math.random() * ((10 - 1) + 1)))*6000));
                                break;
                            case "Casque":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((20 - 1) + 1)),(1 + (int)(Math.random() * ((20 - 1) + 1)))*300));
                                break;
                            case "Clavier":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((10 - 1) + 1)),(1 + (int)(Math.random() * ((10 - 1) + 1)))*100));
                                break;
                            case "Souris":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((10 - 1) + 1)),(1 + (int)(Math.random() * ((10 - 1) + 1)))*90));
                                break;
                            case "PowerBank":
                                produitRepository.save(new Produit(null, produit,1 + (int)(Math.random() * ((20 - 1) + 1)),(1 + (int)(Math.random() * ((20 - 1) + 1)))*2000));
                                break;
                    }

            });
            produitRepository.findAll().forEach(System.out::println);
        };
    }
}
