package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import features.TelefoneTranslator;

/**
 * Testes de unidade da feature
 * 
 * @author Vitor
 */
public class TelefoneTranslatorTest {

	private final String CASE_ALL			= "abcdefghijklmnopqrstuvwxyz-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private final String EXPECTED_ALL  		= "2223334445556667777888999922233344455566677778889999";
	private final String CASE_DO_NOTHING	= "180025872";
	private final String EXPECTED_DO_NOTHING= "180025872";
	private final String CASE_MIX 			= "A1B-2-CbS-3h-8H5";
	private final String EXPECTED_MIX		= "212222734845";
	private final String CASE_NOTHING 		= "";
	private final String EXPECTED_NOTHING 	= "";
	private final String CASE_INPUT_ERR		= "AhS48S-!1@2#A$c%4¨h&7*8*()_+5´`[]~^ \tY\r\ng<,>.:w;?/{Z}ªº°dÇ¹²³4£¢¬4";
	private final String EXPECTED_INPUT_ERR	= "2474871222447859499344";
	
	
	
    @Test
    public void testTranslateTelefone(){
    	TelefoneTranslator telTrans = new TelefoneTranslator();
    	
    	String result = telTrans.translateTelefone(CASE_ALL);
        assertEquals(EXPECTED_ALL, result);
        
        result = telTrans.translateTelefone(CASE_DO_NOTHING);
        assertEquals(EXPECTED_DO_NOTHING, result);
        
        result = telTrans.translateTelefone(CASE_MIX);
        assertEquals(EXPECTED_MIX, result);
        
        result = telTrans.translateTelefone(CASE_NOTHING);
        assertEquals(EXPECTED_NOTHING, result);
        
        result = telTrans.translateTelefone(CASE_INPUT_ERR);
        assertEquals(EXPECTED_INPUT_ERR, result);
    }
}
