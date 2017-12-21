import java.lang.Cloneable;
import java.lang.CloneNotSupportedException;

abstract class EmploiFictif implements Cloneable
{
    public double salaire;
    public String nom;

    public abstract EmploiFictif clone();
}