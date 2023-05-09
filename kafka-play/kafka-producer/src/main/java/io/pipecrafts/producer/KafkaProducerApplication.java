package io.pipecrafts.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Supplier;

@SpringBootApplication
public class KafkaProducerApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaProducerApplication.class, args);
  }

//  @Bean
//  public Supplier<Message> producer() {
//    return () -> new Message(" message from producer");
//  }

}
