/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author conta
 */
public class SerializationLine {

    public String serialLine(DataAccessObject object) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(object);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
