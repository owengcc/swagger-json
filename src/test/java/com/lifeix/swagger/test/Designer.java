package com.lifeix.swagger.test;

import java.io.File;

import com.venizeng.swagger.read.CombineJsons;

public class Designer {

    public static void main(String[] args) {
//        String root = "src/main/resources/designer";
//        File swaggerFile = new File(root+"/app/swagger.json");
//        File definationRoot = new File(root+"/definitions");
//        File pathRoot = new File(root+"/app/paths");
//        String json = new CombineJsons().toSwaggerJson(swaggerFile, definationRoot, pathRoot);
//        System.out.println(json);
        
        String string = "2620,6765,7345,305065,317406,517550,691190,695890,857420,981606,981610,981614,981618,981622,981626,981630,981634,981638,981642,981646,981650,981654,981658,981662,981666,981670,981674,981678,3761389,4737064";
        System.err.println(string.split(",").length);
    }
}
