package dao;

import gen.PersonEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Aashis Khanal on 8/3/15.
 */
@Transactional
@Repository
public class PersonDaoImpl implements PersonDao {

    @Autowired
    SessionFactory sessionFactory;

    public int save(PersonEntity person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
        return 0;
    }

    public int update(PersonEntity person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);
        session.close();
        return 0;
    }

    public int delete(PersonEntity person) {
        return 0;
    }

    public List<PersonEntity> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createCriteria(PersonEntity.class).list();
    }
}
