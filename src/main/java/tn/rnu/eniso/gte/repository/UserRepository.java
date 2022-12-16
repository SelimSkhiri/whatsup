/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.rnu.eniso.gte.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.rnu.eniso.gte.entity.User;

/**
 *
 * @author sskhiri
 */
interface UserRepository extends JpaRepository <User, Long> {
    
    
}
