/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidcsvdao;

/**
 *
 * @author hesham
 */
public class Pyramid {
    private String Pharaoh;
    private String AncientName;
    private String ModernName;
    private String Dynasty;

    private String Site;
    private String Base1;
    private String Base2;
    private String Height;
    private String Slope;
    private String Volume;
    private String Latitude;
    private String Longitude;
    private String Type;
    private String Lepsius;
    private String Material;
    private String Comment;

    public void setPharaoh(String Pharaoh) {
        this.Pharaoh = Pharaoh;
    }

    public void setAncientName(String AncientName) {
        this.AncientName = AncientName;
    }

    public void setModernName(String ModernName) {
        this.ModernName = ModernName;
    }

    public void setSite(String Site) {
        this.Site = Site;
    }

    public void setBase1(String Base1) {
        this.Base1 = Base1;
    }

    public void setBase2(String Base2) {
        this.Base2 = Base2;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public void setSlope(String Slope) {
        this.Slope = Slope;
    }

    public void setVolume(String Volume) {
        this.Volume = Volume;
    }

    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setLepsius(String Lepsius) {
        this.Lepsius = Lepsius;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
    
    public String getType() {
        return Type;
    }

    public String getLepsius() {
        return Lepsius;
    }

    public String getMaterial() {
        return Material;
    }

    public String getComment() {
        return Comment;
    }
    
    public String getPharaoh(){
        return Pharaoh;
    }
    
    public String getAncientName(){
        return AncientName;
    }
    
    public String getModernName(){
        return ModernName;
    }
    
    public String getSite(){
        return Site;
    }
    
    public String getBase1(){
        return Base1;
    }
    
    public String getBase2(){
        return Base2;
    }
    
    public String getHeight(){
        return Height;
    }
    
    public String getSlope(){
        return Slope;
    }
    
    public String getVolume(){
        return Volume;
    }
    
    public String getLatitude(){
        return Latitude;
    }
    
    public String getLongitude(){
        return Longitude;
    }
    
    
    public void setDynasty(String Dynasty) {
        this.Dynasty = Dynasty;
    }

    public String getDynasty() {
        return Dynasty;
    }
    
}
