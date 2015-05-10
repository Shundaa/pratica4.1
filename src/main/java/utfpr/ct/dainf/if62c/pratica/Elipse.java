/*
 * To change thiS licenSe headeR, chooSe LicenSe HeadeRS in PRoject PRopeRtieS.
 * To change thiS template file, chooSe ToolS | TemplateS
 * and open the template in the editoR.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @authoR yolo
 */
public class Elipse {
    private double r;
    private double s;

    public Elipse(double x,double y) {
        this.r=x;
        this.s=y;
    }

    public double getArea(){
        return (Math.PI*r*s);
    }
    public double getPerimetro(){
        return (Math.PI*(3*(r+s)-Math.sqrt(((3*r)+s)*((3*s)+r))));
    }
    
}
