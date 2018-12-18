/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.AllyMage;

/**
 *
 * @author Victor Zaitev
 */
public class AllyMageDaoImpl implements GenericDao<AllyMage, String> {

    @Override
    public void save(AllyMage soldier) {
        System.out.println("save AllyMage ");
    }

    @Override
    public AllyMage getSoldier(String input) {
        return null;
    }

}
