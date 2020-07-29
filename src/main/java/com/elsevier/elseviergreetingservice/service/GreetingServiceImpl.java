package com.elsevier.elseviergreetingservice.service;

import com.elsevier.elseviergreetingservice.domain.Greeting;
import com.elsevier.elseviergreetingservice.dto.GreetingDto;
import com.elsevier.elseviergreetingservice.mapper.GreetingMapper;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  private final GreetingMapper greetingMapper;

  public GreetingServiceImpl(GreetingMapper greetingMapper) {
    this.greetingMapper = greetingMapper;
  }

  @Override
  public GreetingDto greet(String name) {
    Greeting greeting = new Greeting();
    greeting.setMessage("Hello " + name);
    return greetingMapper.greetingToGreetingDto(greeting);
  }
}
