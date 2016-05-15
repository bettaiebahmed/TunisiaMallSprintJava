
package Idao;

import java.util.List;

import entite.boutique;
public interface IDao<T> {

    void add(T t);

    void update(T t);

    void removeById(int id);

    List<T> findAll();
    List<T> find();

    T findById(int id);
    public List<boutique> find(String text);

}
