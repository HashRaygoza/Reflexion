package hash.blog.reflexion;

public class ResultadoAnalisis {
    private String cantidad;
    private String resultado;
    private String instrumento;

    /**
     * @return the cantidad
     */
    public String getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the instrumento
     */
    public String getInstrumento() {
        return instrumento;
    }

    /**
     * @param instrumento the instrumento to set
     */
    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }
    
    public void metodo(){
        System.out.println("Analisis completo");
    }
}
