package Driver_Package;

import java.io.IOException;

import Test_Classes1.Get_TC01;
import Test_Classes1.Patch_TC01;
import Test_Classes1.Post_Create_TC01;
import Test_Classes1.Put_TC01;
import Test_Classes1.Retry_Post_TC01;

public class Driver_Class {

	public static void main(String[] args) throws IOException 
	{	
		Get_TC01.extractor();
		Patch_TC01.extractor();
		Post_Create_TC01.extractor();
		Put_TC01.extractor();
		Retry_Post_TC01.extractor();
	}

}
