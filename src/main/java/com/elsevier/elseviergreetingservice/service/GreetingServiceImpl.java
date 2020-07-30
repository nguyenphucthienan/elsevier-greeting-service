package com.elsevier.elseviergreetingservice.service;

import com.elsevier.elseviergreetingservice.domain.Greeting;
import com.elsevier.elseviergreetingservice.dto.GreetingDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

  private final ModelMapper modelMapper;

  public GreetingServiceImpl(ModelMapper modelMapper) {
    this.modelMapper = modelMapper;
  }

  @Override
  public GreetingDto greet(String name) {
    Greeting greeting = new Greeting();
    greeting.setMessage("Hello " + name);
    return modelMapper.map(greeting, GreetingDto.class);
  }
}
