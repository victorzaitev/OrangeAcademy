/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.AllySoldier;

/**
 *
 * @author Victor Zaitev
 */
public class AllySoldierDaoImpl implements GenericDao<AllySoldier, String> {

    @Override
    public void save(AllySoldier soldier) {
        System.out.println("save AllySoldier ");
    }

    @Override
    public AllySoldier getSoldier(String input) {
        return null;
    }

}
