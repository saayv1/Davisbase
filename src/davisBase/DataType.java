package davisBase;

import java.util.HashMap;
import java.util.Map;

public class DataType {
	public  Map<String,Integer> dataType;
	public  Map<Integer,Integer> dataTypeContent;
	public DataType()
	{
		dataType =  new HashMap<String,Integer>();
		dataTypeContent =  new HashMap<Integer,Integer>();

		dataType.put("TINYINT", 0x04);
		dataType.put("SMALLINT", 0x05);
		dataType.put("INT", 0x06);
		dataType.put("BIGINT", 0x07);
		dataType.put("REAL", 0x08);
		dataType.put("DOUBLE", 0x09);
		dataType.put("DATETIME", 0x0A);
		dataType.put("DATE", 0x0B);
		dataType.put("TEXT", 0x0C);
		
		dataTypeContent.put(0x04, 1);
		dataTypeContent.put(0x05, 2);
		dataTypeContent.put(0x06, 4);
		dataTypeContent.put(0x07, 8);
		dataTypeContent.put(0x08, 4);
		dataTypeContent.put(0x09, 8);
		dataTypeContent.put(0x0A, 8);
		dataTypeContent.put(0x0B, 8);
		dataTypeContent.put(0x0C, 0);
	}
	
	
}
