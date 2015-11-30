package features;

import enums.TelDigit;

/**
 * Feature respons�vel por fazer a tradu��o de um n�mero de telefone alfanumerico
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
