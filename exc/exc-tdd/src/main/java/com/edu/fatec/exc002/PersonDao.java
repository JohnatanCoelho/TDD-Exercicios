package com.edu.fatec.exc002;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    public void save(Person p){
        
    }

    public List<String> isValidToInclude(Person p){
        List<String> errors = new ArrayList<>();

        if(p.getName() == null || p.getName().trim().isEmpty()){
            errors.add("O nome não pode estar vazio");
        } else{
            String [] parts = p.getName().trim().split("\\s+");
            if(parts.length < 2){
                errors.add("O nome deve ser composto por ao menos 2 partes.");
            }
            if(!p.getName().matches("^[a-zA-ZÀ-ÿ\\s]+$")){
                errors.add("O nome deve ser composto apenas de letras.");
            }
        }

        if(p.getAge() < 1 || p.getAge() > 200){
            errors.add("A idade deve estar no intervalo [1, 200].");
        }

        if(p.getEmails() == null || p.getEmails().isEmpty()){
            errors.add("A pessoa deve ter pelo menos um objeto E-mail associado!");
        } else{
            for(Email email: p.getEmails()){
                if(!isEmailValid(email.getName())){
                    errors.add("O e-mail deve estar no formato '_____@____._____' com partes não vazias.");
                }
            }
        }
        return errors;

    }
    
        private boolean isEmailValid(String email){
            if(email==null) return false;

            String[] partsAt = email.split("@");
            if (partsAt.length != 2 || partsAt[0].isEmpty() || partsAt[1].isEmpty()) {
                return false;
            }
            String[] partsDot = partsAt[1].split("\\.");
            if (partsDot.length < 2) {
                return false;
            }
            for (String part : partsDot) {
            if (part.isEmpty()) {
                return false;
            }
        }
        return true;
        }
}
