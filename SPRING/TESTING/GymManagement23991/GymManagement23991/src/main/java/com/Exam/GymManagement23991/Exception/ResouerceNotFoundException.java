package com.Exam.GymManagement23991.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


import static org.yaml.snakeyaml.tokens.Token.ID.Value;
@ResponseStatus( value =HttpStatus.NOT_FOUND)
public class ResouerceNotFoundException extends RuntimeException{
   // @ResponseStatus(value = HttpStatus.NOT_FOUND)

    public ResouerceNotFoundException(String message){
       super(message);
    }
}
