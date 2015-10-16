package dao;

import gen.PersonEntity;

import java.util.List;

/**
 * Created by Aashis Khanal on 8/3/15.
 */
public interface PersonDao {
    public int save(PersonEntity person);
    public int update(PersonEntity person);
    public int delete(PersonEntity person);
    public List<PersonEntity> getAll();
}
