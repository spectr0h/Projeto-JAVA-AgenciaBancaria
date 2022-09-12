package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
	static SimpleDateFormat formatandoData = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	
	public static String dateToString(Date data) {
		return formatandoData.format(data);
	}
	
	public static String doubleToString(Double valor) {
		return formatandoValores.format(valor);
	}
}
