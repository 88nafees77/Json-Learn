/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.BufferedWriter;
import java.io.IOException;

/**
 *
 * @author conta
 */
public class JsonWriteString {

    public void writeIntoFile(String str, BufferedWriter writer) throws IOException {
        writer.append(str);
    }
}
