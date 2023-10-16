package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class pegarData {

	public static String obterDataHoraAtualComoString() {
		 Date dataHoraAtual = new Date();

	        // Define o formato da data e hora desejado
	        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	        // Formata a data e hora atual como uma string
	        String dataHoraComoString = formato.format(dataHoraAtual);

	        return dataHoraComoString;
	}

}
