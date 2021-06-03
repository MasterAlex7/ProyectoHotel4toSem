/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misclases;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author Alexri
 */
public class GenerarPDF {
    String nombreHuesped  = "";
    String cdOrigen  = "";
    Date fechaIngreso;
    Date fechaSalida;
    String tipodeHab  = "";
    int Costohab  = 0;
    int diasUsados  = 0;
    int Totalsc  = 0;
    int Totalce  = 0;
    String servicios  = "";
    
    public GenerarPDF(String nombreHuesped, String cdOrigen, Date fechaIngreso, Date fechaSalida, String tipodeHab, int costoHab, int diasUsados, int Totalsc,int Totalce, String servicios){
        this.Costohab=costoHab;
        this.Totalce=Totalce;
        this.Totalsc=Totalsc;
        this.cdOrigen=cdOrigen;
        this.diasUsados=diasUsados;
        this.fechaIngreso=fechaIngreso;
        this.fechaSalida=fechaSalida;
        this.nombreHuesped=nombreHuesped;
        this.servicios=servicios;
        this.tipodeHab=tipodeHab;
    }

    public String getNombreHuesped() {
        return nombreHuesped;
    }

    public void setNombreHuesped(String nombreHuesped) {
        this.nombreHuesped = nombreHuesped;
    }

    public String getCdOrigen() {
        return cdOrigen;
    }

    public void setCdOrigen(String cdOrigen) {
        this.cdOrigen = cdOrigen;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipodeHab() {
        return tipodeHab;
    }

    public void setTipodeHab(String tipodeHab) {
        this.tipodeHab = tipodeHab;
    }

    public int getCostohab() {
        return Costohab;
    }

    public void setCostohab(int Costohab) {
        this.Costohab = Costohab;
    }

    public int getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(int diasUsados) {
        this.diasUsados = diasUsados;
    }

    public int getTotalsc() {
        return Totalsc;
    }

    public void setTotalsc(int Totalsc) {
        this.Totalsc = Totalsc;
    }

    public int getTotalce() {
        return Totalce;
    }

    public void setTotalce(int Totalce) {
        this.Totalce = Totalce;
    }

    public String getServicios() {
        return servicios;
    }

    public void setServicios(String servicios) {
        this.servicios = servicios;
    }

    public GenerarPDF() {
    }
    
    public void generaciondepdf(){
        try (PDDocument document = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A6);
            document.addPage(page);

            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Text
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 60, page.getMediaBox().getHeight() - 200);
            contentStream.showText(this.nombreHuesped);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 70, page.getMediaBox().getHeight() - 220);
            contentStream.showText("Se le otorga este diploma por:");
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 90, page.getMediaBox().getHeight() - 240);
            contentStream.showText(this.cdOrigen);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 90, page.getMediaBox().getHeight() - 260);
            SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-YYYY");
            String fIn=sdf2.format(fechaSalida);
            contentStream.showText(fIn);
            contentStream.showText(fIn);
            contentStream.endText();
            
            contentStream.beginText();
            contentStream.setFont(PDType1Font.TIMES_BOLD, 12);
            contentStream.newLineAtOffset( 90, page.getMediaBox().getHeight() - 280);
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
            String fs=sdf.format(fechaSalida);
            contentStream.showText(fs);
            contentStream.endText();
      
            // Image
            PDImageXObject image;
            image= PDImageXObject.createFromFile("/src/imagenes/yummy2.png", document);
            contentStream.drawImage(image,70, page.getMediaBox().getHeight() - 170);
            
            /*PDImageXObject image2;
            image2= PDImageXObject.createFromFile("/src/imagenes/", document);
            contentStream.drawImage(image2,70, page.getMediaBox().getHeight() - 430);*/

            contentStream.close();

            document.save("document.pdf");
        } catch (IOException ex) {
            System.out.println("No se pudo crear");
        }
    }
}
