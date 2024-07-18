package io.loop.test.day8;

import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.testng.annotations.Test;

/*
1. Go to “http://demo.guru99.com/test/upload”
2. Upload file into Choose File
3. Click terms of service check box
4. Click Submit File button
5. Validate expected message appeared. Expected: “1 file has been successfully uploaded.
*/
public class T3_upload {

    @Test
    public void upload_file(){
        Driver.getDriver().get(ConfigurationReader.getProperties("guru.url"));

    }




}
