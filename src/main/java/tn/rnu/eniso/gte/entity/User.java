/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.rnu.eniso.gte.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author sskhiri
 */
public class User {
    
    
   @Id @GeneratedValue
   Long id;
   
   @Column(unique=true)
   String login;
   
   //@ManyToOne(mappedBy="dest")
   //List<Message> messages;
   
   
   
}
