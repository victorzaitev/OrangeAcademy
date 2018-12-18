/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.AllyDragon;

/**
 *
 * @author Victor Zaitev
 */
public class AllyDragonDaoImpl implements GenericDao<AllyDragon, String> {

    @Override
    public void save(AllyDragon soldier) {
        System.out.println("save AllyDragon ");
    }

    @Override
    public AllyDragon getSoldier(String input) {
        return null;
    }

}
