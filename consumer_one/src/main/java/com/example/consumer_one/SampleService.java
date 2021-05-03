package com.example.consumer_one;

import java.time.ZonedDateTime;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@Slf4j
@Service
public class SampleService {


  public ZonedDateTime getUpdatedTime() {

    return restTemplate().getForObject("http://localhost:8088/vodqa",ZonedDateTime.class);
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
