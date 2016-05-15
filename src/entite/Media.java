/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entite;

import java.util.Date;

/**
 *
 * @author Hakim
 */
public class Media {
    private int id ; 
    private Date uploadAt ;
    private String name ; 
    private String path ;

    public Media(int id, Date uploadAt, String name, String path) {
        this.id = id;
        this.uploadAt = uploadAt;
        this.name = name;
        this.path = path;
    }

    public Media(Date uploadAt, String name, String path) {
        this.uploadAt = uploadAt;
        this.name = name;
        this.path = path;
    }

    public Media() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getUploadAt() {
        return uploadAt;
    }

    public void setUploadAt(Date uploadAt) {
        this.uploadAt = uploadAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Media{" + "id=" + id + ", uploadAt=" + uploadAt + ", name=" + name + ", path=" + path + '}';
    }
    
    
}
