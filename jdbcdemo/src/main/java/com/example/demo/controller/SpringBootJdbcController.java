package com.example.demo.controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  
public class SpringBootJdbcController {  
    @Autowired  
    JdbcTemplate jdbc;    
   
    @RequestMapping("/insert")  
    public String index(){  
    //    jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");  
        
       jdbc.execute( "insert into  STUDENTS values (2,'Nidhi',05,'wakad')");
       
        return"data inserted Successfully";  
    }  
}

     