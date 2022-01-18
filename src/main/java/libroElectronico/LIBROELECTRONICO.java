/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroElectronico;

/**
 *
 * @author hinda
 */
import org.apache.commons.lang3.RandomStringUtils;
import static org.apache.commons.lang3.RandomStringUtils.*;

public class LIBROELECTRONICO {

    //Attributos
    private String identificador;
    private String tituloLibro;
    private int numeroPaginasTotal;//no puede almacenar mas que 9999
    private double tamanyo;//no puede mas que 10MB
    private int numeroPaginaActual;

    //constrector pordefecto
    public LIBROELECTRONICO() {
        this.identificador = RandomStringUtils.randomNumeric(3);//entre 000 y 999
        int identificador = Integer.parseInt(this.identificador);
        if (identificador > 0 && identificador < 9) {
            this.identificador = "" + identificador;
        }
        this.tituloLibro = "Don Quijote de la Mancha";
        this.numeroPaginasTotal = 1435;
        this.tamanyo = 5;
        this.numeroPaginaActual = 1;
    }

    public LIBROELECTRONICO(String tituloLibro, int numeroPaginasTotal, double tamanyo, int numeroPaginaActual) {
        this.identificador = RandomStringUtils.randomNumeric(3);//entre 000 y 999
        int identificador = Integer.parseInt(this.identificador);
        if (identificador > 0 && identificador < 9) {
            this.identificador = "" + identificador;
        }
        this.tituloLibro = tituloLibro;
        this.numeroPaginasTotal = numeroPaginasTotal;
        if (this.numeroPaginasTotal > 9999) {
            this.numeroPaginasTotal = 0;
        }
        this.tamanyo = tamanyo;
        if (this.tamanyo > 10) {
            this.tamanyo = 0;
        }

        this.numeroPaginaActual = numeroPaginaActual;
        if (this.numeroPaginaActual < 0) {
            this.numeroPaginaActual = 1;
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public int getNumeroPaginasTotal() {
        return numeroPaginasTotal;
    }

    public double getTamanyo() {
        return tamanyo;
    }

    public int getNumeroPaginaActual() {
        return numeroPaginaActual;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public void setNumeroPaginasTotal(int numeroPaginasTotal) {
        this.numeroPaginasTotal = numeroPaginasTotal;
        if (this.numeroPaginasTotal > 9999) {
            this.numeroPaginasTotal = 0;
        }

    }

    public void setTamanyo(double tamanyo) {
        this.tamanyo = tamanyo;
        if (this.tamanyo > 10) {
            this.tamanyo = 0;
        }
    }

    public void setNumeroPaginaActual(int numeroPaginaActual) {
        this.numeroPaginaActual = numeroPaginaActual;
        if (this.numeroPaginaActual < 0) {
            this.numeroPaginaActual = 1;
        }
    }

    @Override
    public String toString() {
        return "LIBROELECTRONICO{" + "identificador=" + identificador + ", tituloLibro=" + tituloLibro + ", numeroPaginasTotal=" + numeroPaginasTotal + ", tamanyo=" + tamanyo + ", numeroPaginaActual=" + numeroPaginaActual + '}';
    }
    
    

    public void pasarPagina() {
        if (this.numeroPaginasTotal > this.numeroPaginaActual) {
            this.numeroPaginaActual += 1;
        }
        System.out.println("no se puede");
    }

    public void retrocederPagina() {
        if (this.numeroPaginaActual > 1) {
            this.numeroPaginaActual -= 1;
        }
        System.out.println("no se puede");
    }

    public void saltar(int numero) {
        if (numero > 0) {
            this.numeroPaginaActual = numeroPaginaActual+numero;
        } else if(numero < 0) {
            this.numeroPaginaActual= numeroPaginaActual-numero;
        }        
    }
    
    

}
