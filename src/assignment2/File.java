/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author conta
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public String[] readFile() throws Exception {
        SerializationLine sl = new SerializationLine();
        JsonWriteString js = new JsonWriteString();
        FileSplitter splitter = new FileSplitter();
        DataAccessObject accessObject = null;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(new java.io.File("C:\\Users\\conta\\OneDrive\\Desktop\\details.txt")));
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\conta\\OneDrive\\Desktop\\serial.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] lineRead = splitter.lineSplitter(line);
                accessObject = setDao(lineRead);
                String string = sl.serialLine(accessObject);
                js.writeIntoFile(string + "\n", writer);
                line = reader.readLine();
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DataAccessObject setDao(String line[]) {
        DataAccessObject dao = new DataAccessObject();
        dao.setName(line[0]);
        dao.setAge(line[1]);
        dao.setQualification(line[2]);
        return dao;

    }

}
