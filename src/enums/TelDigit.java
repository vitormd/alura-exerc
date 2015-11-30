package enums;
/**
 * Created by Vitor on 29/11/2015.
 */
public enum TelDigit {
    HYPHEN("(-)", ""),
    ABC("[abcABC]", "2"),
    DEF("[defDEF]", "3"),
    GHI("[ghiGHI]", "4"),
    JKL("[jklJKL]", "5"),
    MNO("[mnoMNO]", "6"),
    PQRS("[pqrsPQRS]","7"),
    TUV("[tuvTUV]", "8"),
    WXYZ("[wxyzWXYZ]", "9"),
    OTHERS("[^a-zA-Z0-9]","");

    private final String digit;
    private final String number;

    private TelDigit(String digit, String number){
        this.digit = digit;
        this.number = number;
    }

    public String getDigit(){
        return digit;
    }

    public String getNumber(){
        return number;
    }
}
