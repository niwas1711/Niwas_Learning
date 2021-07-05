package com.Thread;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
//import org.json.JSONArray;
//import org.json.JSONObject;

public class JsonParse
	{
  public static void main(String[] args) {
    //
    System.out.println("hello");
try{
      /*String content = new String(Files.readAllBytes(Paths.get("/Volumes/Macintosh/Niwas/Learning/jsonsfile.json")), StandardCharsets.UTF_8);

      	JSONObject jb = new JSONObject(content);
            System.out.println(jb.getJSONObject("e2EJenkinsProvisioning"));

            System.out.println(jb.get("e2EJenkinsProvisioning"));


      	//JSONArray array = jb.getJSONArray("e2EJenkinsProvisioning");
           // System.out.println(array.get(0));

      */
      System.out.println(1);
}
catch (Exception e)
{ //System.out.println(2);
	e.printStackTrace();
}
finally{
	//System.out.println(3);
}

    System.out.println(    trdemo());

  }

  public static int trdemo()
	  {
	  	try{
	  		return 1;
		  }
	  	catch (Exception e)
		  {
		  	return 2;
		  }
	  	finally{
	  		return  3;
		  }

	  }

	}
