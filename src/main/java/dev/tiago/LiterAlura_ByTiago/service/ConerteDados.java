package dev.tiago.LiterAlura_ByTiago.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConerteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();


    @Override
    public <T> T obterDAdos(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        }catch (JsonProcessingException e){
            throw new RuntimeException();
        }
    }
}

