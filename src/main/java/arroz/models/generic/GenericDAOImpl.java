package arroz.models.generic;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private Class<T> clazz;
    @Autowired
    private EntityManager entityManager;

    private static int MAX_RESULT = 40;
    private static String ORDER = "desc";

    public GenericDAOImpl() {

    }

    public Class<T> getClazz() {
        return clazz;
    }
    
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.
                    createEntityManagerFactory("tarefas");

        factory.close();
    }

    public void teste(T entity){
        entityManager.persist(entity);
    }
}
