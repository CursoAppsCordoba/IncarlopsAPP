package incarlopsa.com.appincarlopsa;

public class UNUSED_TipoFichero extends DataBaseItem{

    //Propiedades
    private String nombre = null;
    private Boolean mostrable = true;

    //Constructor
    public UNUSED_TipoFichero(Integer id, String nombre, Boolean mostrable) {
        this.id = id;
        this.nombre = nombre;
        this.mostrable = mostrable;
    }

    //Constructor
    public UNUSED_TipoFichero(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mostrable = true;
    }

    public UNUSED_TipoFichero(){}

    //Getter/Setter
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMostrable() {
        return mostrable;
    }

    public void setMostrable(Boolean mostrable) {
        this.mostrable = mostrable;
    }

    //Equals y Hash


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        UNUSED_TipoFichero that = (UNUSED_TipoFichero) o;

        if (!nombre.equals(that.nombre)) return false;
        return mostrable.equals(that.mostrable);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + nombre.hashCode();
        result = 31 * result + mostrable.hashCode();
        return result;
    }

}