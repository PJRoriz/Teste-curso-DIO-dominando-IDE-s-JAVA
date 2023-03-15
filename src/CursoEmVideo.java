import java.util.Locale;
import java.util.Date;
import java.awt.Dimension;
import java.awt.Toolkit;


public class CursoEmVideo {

	public static void main(String[] args) {
		
		Date relogio = new Date();
		System.out.println("A hora do sistema é ");
		System.out.println(relogio.toString());
		
		Locale loc = Locale.getDefault();
		System.out.print("O idioma do sistema é ");
		System.out.println(loc.getDisplayLanguage());
		
		  Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
	        int lar = (int) tela.getWidth();
	        int alt = (int) tela.getHeight();
	        System.out.println("Sua tela tem resolução " + lar + " x " + alt);
		
	}

}