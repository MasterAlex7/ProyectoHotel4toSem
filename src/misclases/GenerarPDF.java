/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misclases;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
    
    
    
    public void prubeaPdf(){
        Document documento=new Document();
        LocalDate fechaActual= LocalDate.now();
        SimpleDateFormat formato=new SimpleDateFormat("dd-MM-yyy");
        
        
        try{
            
            FileOutputStream archivoPDF=new FileOutputStream("Ticket "+this.nombreHuesped+".pdf");
            PdfWriter.getInstance(documento, archivoPDF);
            
            Image header=Image.getInstance("src/imagenes/yummy2.png");
            header.scaleToFit(100, 100);
            header.setAlignment(Chunk.ALIGN_CENTER);
            
            
            Paragraph parrafo=new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Tahoma",18,Font.BOLD,BaseColor.BLACK));
            parrafo.add("\n\nYummy Resorts\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",16,Font.ITALIC,BaseColor.BLACK));
            parrafo.add("\nLas mejores experiencias nacen aqui\n");
            parrafo.setFont(FontFactory.getFont("Tahoma",14,Font.BOLD,BaseColor.BLACK));
            parrafo.add("\nGrieta de la Orden 687, Calvillo,AGS."+"\n");
            parrafo.add("\nFecha: "+fechaActual);
            
            
            Paragraph parrafo1=new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo1.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo1.add("\n\nNombre del huesped: "+this.nombreHuesped+"\n");
            //parrafo1.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo1.add("Ciudad de origen: "+this.cdOrigen+"\n");
            parrafo1.add("Fecha de Ingreso: "+formato.format(this.fechaIngreso)+"\n");
            parrafo1.add("Fecha de Salida: "+formato.format(this.fechaSalida)+"\n");
            parrafo1.add("Tipo de Habitacion: "+this.tipodeHab+"\n");
            parrafo1.add("Costo de Habitacion: "+this.Costohab+"\n");
            parrafo1.add("Dias de hospedaje: "+this.diasUsados+"\n");
            parrafo1.add("Total a pagar sin cargos extra: "+this.Totalsc+"\n");
            parrafo1.add("Total a pagar son cargos extra: "+this.Totalce+"\n");
            parrafo1.add("Servicios usados \n"+this.servicios+"\n");

            
            Image firma=Image.getInstance("src/imagenes/firma.png");
            firma.scaleToFit(100,100);
            firma.setAlignment(Chunk.ALIGN_RIGHT);
            
            Paragraph parrafo2=new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_RIGHT);
            parrafo1.setFont(FontFactory.getFont("Tahoma", 10, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo2.add("Firma del Dueño\n");
            parrafo2.add("Agradecemos su preferencia y lo esperamos de nuevo!!!\n\n");
            
            Paragraph parrafo3=new Paragraph();
            parrafo3.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo3.setFont(FontFactory.getFont("Tahoma", 12, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo3.add("Salida completada");
            
           
            documento.open();
            documento.add(header);
            documento.add(parrafo);
            documento.add(parrafo1);
            documento.add(firma);
            documento.add(parrafo2);
            documento.add(parrafo3);
        }catch(DocumentException | FileNotFoundException e){
                System.out.println("Error en PDF"+e.getMessage());
        }catch(IOException e){
            System.out.println("Error en la imagen"+ e.getMessage());
        }
        documento.close();
        JOptionPane.showMessageDialog(null, "Ticket Generado con Exito");
    
    }
}
