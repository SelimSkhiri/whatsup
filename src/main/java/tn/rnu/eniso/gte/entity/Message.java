/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.rnu.eniso.gte.entity;

import lombok.Data

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

/**
 *
 * @author sskhiri
 */
@Data @Entity
public class Message {
    
    @Id @GeneratedValue
    private long id; 
    
    @ManyToOne
    private User dest; 
    
    
    
    @ManyToOne
    private User src;
    
    private String message; 
     
    
}
