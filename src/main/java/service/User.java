package service;

import com.fasterxml.uuid.Generators;
import lombok.Getter;
import repository.TableEntity;

import java.util.UUID;

public class User implements TableEntity {
    @Getter
    private String name;
    @Getter
    private String password;
    @Getter
    private UUID id;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.id = Generators.randomBasedGenerator().generate();
    }
}
