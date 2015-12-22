/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Emplacement;
import bean.Equipement;
import dao.AbstractDao;

/**
 *
 * @author moulaYounes
 */
public class EmplacementService extends AbstractDao<Emplacement> {

    EquipementService equipementService = new EquipementService();

    public EmplacementService() {
        super(Emplacement.class);
    }

    @Override
    public int save(Emplacement emplacement) throws Exception {
        Equipement equipement = equipementService.findById(emplacement.getEquipement().getId());
        super.save(emplacement);
        equipement.setQteGlobal(equipement.getQteGlobal() + emplacement.getQte());
        equipementService.update(equipement);
        return 1;
    }

}
