/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Salle;
import dao.AbstractDao;

/**
 *
 * @author moulaYounes
 */
public class SalleService extends AbstractDao<Salle>{

    public SalleService() {
        super(Salle.class);
    }
    
}
