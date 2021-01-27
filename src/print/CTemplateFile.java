/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

import java.awt.Component;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author REDBUL
 */
public class CTemplateFile {
    String path;
    int prac;
    int[] opctions=new int[6];
    String[] names;
    private JFileChooser openFile;
    
    protected CTemplateFile(Component x){
        openFile = new JFileChooser();
        openFile.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
        openFile.setCurrentDirectory(new File("."));
        int returnedValue = openFile.showOpenDialog(x);
        if(returnedValue == JFileChooser.APPROVE_OPTION){
                String filename=openFile.getSelectedFile().getName();
                path=openFile.getSelectedFile().getPath();
                
        }

            
    }
    
}

