package features;

import enums.TelDigit;

/**
 * Feature responsável por fazer a tradução de um número de telefone alfanumerico
 * 
 * @author Vitor
 */
public class TelefoneTranslator {

	public String translateTelefone(String tel) {
		for (TelDigit td : TelDigit.values()) {
			tel = tel.replaceAll(td.getDigit(), td.getNumber());
		}
		return tel;
	}
}
