/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package md.orange.academy.armies.dao;

import md.orange.academy.armies.soldier.AllyCommander;

/**
 *
 * @author Victor Zaitev
 */
public class AllyCommanderDaoImpl implements GenericDao<AllyCommander, String> {

    @Override
    public void save(AllyCommander soldier) {
        System.out.println("save AllyCommander ");
    }

    @Override
    public AllyCommander getSoldier(String input) {
        return null;
    }

}
