package test01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class test01 {

	public static void main(String[] args) {
		
		
	/*	
		BigDecimal diBigDecimal = objectToBigDecimal(0.06);
		BigDecimal diBigDecimal2 = objectToBigDecimal(0.01);
		System.out.println(diBigDecimal.toString());
		 System.out.println(0.06+0.01);
		 System.out.println(diBigDecimal.add(diBigDecimal2).doubleValue());*/
		StringBuilder errorMsg = new StringBuilder(100);
		errorMsg.append("$(form).find(\"[name=\\\"");
		errorMsg.append("<--error-->");
		errorMsg.append("\\\"]\").closest(\"td\").prev().text() + \"，");
		errorMsg.append("<--message-->>");
		errorMsg.append("\"");
		System.out.println(errorMsg);
	}
    /**
     * 把Object转为BigDecimal(0也会转为空)
     * @param object
     * @return
     */
    public static BigDecimal objectToBigDecimal(Object object) {
        BigDecimal decimal = null;
        if (object != null) {
            if(object instanceof BigDecimal) {
                decimal = (BigDecimal) object;
            } else if(object instanceof String) {
                decimal = new BigDecimal((String) object);
            } else if(object instanceof BigInteger) {
                decimal = new BigDecimal((BigInteger) object);
            } else if(object instanceof Number) {
                decimal = new BigDecimal(((Number) object).doubleValue());
            }
        }
        return decimal;
    }
	
}
