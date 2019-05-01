package arroz.models.generic;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.PersistenceUnits;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Null;
import javax.websocket.Session;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import arroz.models.cidade.Cidade;

public abstract class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

    private Class<T> clazz;
    
    // private EntityManagerFactory entityManagerFactory;
    
    // @PersistenceUnit
    // public void setEntityManagerFactory(EntityManagerFactory emf){
    //  this.entityManagerFactory = emf;   
    // }

    @Autowired
    public EntityManager entityManager;

    @Autowired
    public EntityManagerFactory entityManagerFactory;

    @Bean
    public Session getEntityManagerFactory(){
        if(entityManagerFactory.unwrap(SessionFactory.class) == null){
            throw new NullPointerException("fabrica não é uma hibernate fabrica");
        }
        SessionFactory sf = entityManagerFactory.unwrap(SessionFactory.class);
        Session session = null;
        try {
            session = (Session) sf.openSession();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }

    public GenericDAOImpl() {

    }

    public Class<T> getClazz() {
        return clazz;
    }
    
    // public List<T> teste() {
    //     EntityManager em = entityManagerFactory.createEntityManager();
    //     return (List<T>) em.createQuery("from Cidade", Cidade.class).getResultList();
    // }

    // public List<T> teste2() {
    //     EntityManager em = entityManagerFactory.createEntityManager();
    //     return (List<T>) em.createQuery("from Cidade", Cidade.class).getResultList();
    // }
}
