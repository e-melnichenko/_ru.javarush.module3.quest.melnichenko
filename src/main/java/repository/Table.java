package repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class Table <T extends TableEntity> {
//    todo is map id need?
    protected Map<UUID, T> tableMap = new HashMap<>();

    public T findById(UUID id) {
        return tableMap.get(id);
    }

    public T add(T entity) {
        return tableMap.put(entity.getId(), entity);
    }
}
