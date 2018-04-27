/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.dictionaryapplication.restoredatabase;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author nethm
 */
public class DatabaseRestore {

    public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {
        try {
            String[] executeCmd = new String[]{"mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName, "-e", " source " + source};
            Process runtimeProcess;
            String excet="calc";
            runtimeProcess = Runtime.getRuntime().exec(excet);
            int processComplete = runtimeProcess.waitFor();
            if (processComplete == 0) {
                System.out.println("Backup restored successfully");
                return true;
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(DatabaseRestore.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private File file;

    public static void main(String[] args) {
        restoreDB("E", "e","ef" ,"wrs");
                
    }
}
