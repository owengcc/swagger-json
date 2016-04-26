package com.lifeix.swagger.test;

import java.io.File;

import com.venizeng.swagger.read.CombineJsons;

public class Community {

    public static void main(String[] args) {
        File swaggerFile = new File("src/main/resources/community/community-app/swagger.json");
        File definationRoot = new File("src/main/resources/community/definitions");
        File pathRoot = new File("src/main/resources/community/community-app/paths");
        String json = new CombineJsons().toSwaggerJson(swaggerFile, definationRoot, pathRoot);
        System.out.println(json);
        
    }
}
