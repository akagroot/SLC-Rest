/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.service;

import com.slc.model.StormpathAccount;

/**
 *
 * @author jberroteran
 */
public interface StormpathService {
    public StormpathAccount getStormpathAccount(String email);
}
