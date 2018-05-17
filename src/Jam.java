
/**
 *Classe publica Jam
 * @author alumne
 */
public class Jam {
	private String contents;
	private String date;
	private int capacity;
	private static int numTotalJars, noJam = 0;

        /**
         * Constructor classe Jam
         * @param contents
         * @param date
         * @param size 
         */
	Jam(String contents, String date, int size) {
		this.contents = contents;
		this.date = date;
		capacity = size;
		numTotalJars++;
	}

    /**
     *Retorna un true si esta buit
     * @return boolean 
     */
    public boolean empty() {
		return (capacity == 0);
	}

    /**
     *Imprimeix els Jars creats i els que s'han quedat sense melmelada
     */
    public void print() {
		System.out.println(contents + " " + date + " " + capacity + " fl. oz.");
		System.out.println("El n�mero total de Jars creats des de l'inici dels temps s�n: " + Jam.getNumTotalJars());
		System.out.println("El n�mero de Jars que s'han quedat sense melmelada des de l'inici dels temps: " + Jam.getNoJam());
	}

    /**
     *Imprimeix, si queda melmelada a la jarra i si ha untat les torrades 
     * @param fluidOz
     */
    public void spread(int fluidOz) {
		if (!empty()) {
			if (fluidOz < capacity) {
				System.out.println("Spreading " + fluidOz + " fluid ounces of " + contents);
				capacity = capacity - fluidOz;
			} else {
				System.out.println("Spreading " + capacity + " fluid ounces of " + contents);
				capacity = 0;
				noJam++;			}
		} else {
			System.out.println("No jam in the Jar!");
		}
	}

    /**
     *Retorna el total de gerres
     * @return int
     */
    public static int getNumTotalJars() {
		return numTotalJars;
	}

    /**
     *Retorna que queda 0 melmelades
     * @return int
     */
    public static int getNoJam() {
		return noJam;
	}
}
