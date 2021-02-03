package print;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class CTemplateFile {
    String path;
    boolean ok=false;
    int[] options=new int[7];
    public String[] names;
    String filename;
    private JFileChooser openFile;
    
       protected CTemplateFile(){
    
    }
       
           protected CTemplateFile(int prac, int x1, int x2, int x3, int x4, int x5, int x6){
        options[0]=prac;
        options[1]=x1;
        options[2]=x2;
        options[3]=x3;
        options[4]=x4;
        options[5]=x5;
        options[6]=x6;
        names=new String[prac];
    }
    
    protected void filechooser(Component x){
        openFile = new JFileChooser();
        openFile.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "text"));
        openFile.setCurrentDirectory(new File("."));
        int returnedValue = openFile.showOpenDialog(x);
        if(returnedValue == JFileChooser.APPROVE_OPTION){
                filename=openFile.getSelectedFile().getName();
                path=openFile.getSelectedFile().getPath();
                set_vars();
                ok=true;
        }    
    }
    

    
    private String gte_filename(){
        return filename;
    }
    
    private void set_vars(){
        try {
            Scanner ina=new Scanner(Paths.get(path));
            int a=0;
            for(int i=0;i<=6;i++){
                options[i]=Integer.parseInt(ina.nextLine());
            }
                names=new String[options[0]];
            for(int j=0;j<options[0];j++){
                names[j]=ina.nextLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void set_name(String name,int index){
        names[index]=new String();
        names[index]=name;
    }
    
}

