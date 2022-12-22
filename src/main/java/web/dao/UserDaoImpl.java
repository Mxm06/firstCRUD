package web.dao;

import org.springframework.stereotype.Repository;
import web.Model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class UserDaoImpl implements UserDao{
    final private String FROM_USER = "From User";

    @PersistenceContext
    private EntityManager entityManager;

    public void save(User user) {
        entityManager.persist(user);
    }

    public void delete(User user) {
        entityManager.remove(user);
    }

    public void update(User user) {
        entityManager.merge(user);
    }

    public List<User> listAllUsers() {
        return entityManager.createQuery(FROM_USER).getResultList();
    }
}