/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

/**
 *
 * @author Victor Zaitev
 * @param <T>
 * @param <R>
 */
public interface GenericDao<T, R> {

    void save(T soldier);

    T getSoldier(R input);

}
