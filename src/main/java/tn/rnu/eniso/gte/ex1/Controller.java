/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tn.rnu.eniso.gte.ex1;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author sskhiri
 */
public class Controller {
    
    
    HashMap<String, LinkedBlockingQueue<MessageDTO>> msg = new HashMap<>(); 
    
    @PostMapping
    public boolean send(@RequestBody MessageDTO m){
        //LinkedBlockingQueue q = msg.get(m.getDest()); 
        //if (q == null){
        //    q = new LinkedBlockingQueue(); 
        //    msg.put(m.getDest(), q); 
        //}
        //q.offer(m); 
        msg.computeIfAbsent(m.getDest(), k -> new LinkedBlockingQueue()).offer(m);
        return true; 
        
        
    }
    
    @GetMapping("/whatsup")
    public Boolean whatsUp (@PathVariable String dest) throws InterruptedException {
       msg.computeIfAbsent(dest, k -> new LinkedBlockingQueue()).take();
       return true;
    } 

    

}
