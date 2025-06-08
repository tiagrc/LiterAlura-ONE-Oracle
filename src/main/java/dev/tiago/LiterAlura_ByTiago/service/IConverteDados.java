package dev.tiago.LiterAlura_ByTiago.service;

public interface IConverteDados {
    <T> T obterDAdos(String json, Class<T> classe);

}
