/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;
 

import dao.MediaDao;
import entite.Media;
import java.awt.Image;
import java.io.File;
 import java.util.Date;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;
 
/**
 *
 * @author khlifi
 */
public class ProfilePictruesManager {
 
    String imageExtension[] = {".jpeg", ".gif", ".jpg",".png", ".JPEG", ".GIF", ".JPG",".PNG"};
 
    public Image loadPicture(JLabel pictureContainer) {
        Image image = null;
        try {
            if(checkFile()!=null){
                image = ImageIO.read(checkFile());
            }else{
                return null;
            }
           
        } catch (IOException ex) {
            Logger.getLogger(MediaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        Image resizedImage = image.getScaledInstance(pictureContainer.getWidth(), pictureContainer.getHeight(), Image.SCALE_DEFAULT);
        if (resizedImage != null) {
            return resizedImage;
        }
        return null;
    }
 
    public Image changePicture(JLabel pictureContainer,File img) throws IOException, InterruptedException, ParseException {
        
        Media med = new Media();
        MediaDao medDao = new MediaDao();
         //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
         // Date date = new Date();
        String filePath=null;
       // SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        // Ajout au table media 
         med.setName(img.getName());
      //  med.setUploadAt(formatter.parse(dateFormat.format(date)));
         String dernierId = Integer.toString(medDao.getDernierId()+1);
        String extension = FilenameUtils.getExtension(img.getPath());
        String textPath = "C://wamp//www//TunisiaMallMegaDev//web//uploads//"+dernierId+"."+extension;
        med.setPath(textPath);
        System.out.println("ja3ba");
    
        medDao.addMedia(med);
        Path destinationPath=Paths.get(textPath);
        if (img != null) {
            filePath = img.getPath();
        }
        if (filePath != null) {
            File checkFile = checkFile();
            if (checkFile!=null){checkFile.delete();}
            //Files.copy(file.toPath(),destinationPath );
           // System.out.println(""+destinationPath);
           Files.copy(img.toPath(), destinationPath,
            StandardCopyOption.REPLACE_EXISTING);
            return loadPicture(pictureContainer);
                  
        }
        return null;
 
       
    }
 
    private File checkFile() {
        Media med = new Media();
        MediaDao medDao = new MediaDao();
       String dernierId = Integer.toString(medDao.getDernierId()+1);
       // String UserID = "13";
        for (String imageExtension1 : imageExtension) {
            File profileImage = new File("C://wamp//www//TunisiaMallMegaDev//web//uploads//" + dernierId + "" + imageExtension1);
            if (profileImage.isFile()) {
                return profileImage;
            }
        }
        return null;
    }
 
}
