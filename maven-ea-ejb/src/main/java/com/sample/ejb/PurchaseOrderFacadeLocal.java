/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.ejb;

import com.sample.model.PurchaseOrder;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author esaenz
 */
@Local
public interface PurchaseOrderFacadeLocal {

    void create(PurchaseOrder purchaseOrder);

    void edit(PurchaseOrder purchaseOrder);

    void remove(PurchaseOrder purchaseOrder);

    PurchaseOrder find(Object id);

    List<PurchaseOrder> findAll();

    List<PurchaseOrder> findRange(int[] range);

    int count();
    
}
