package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest
{
    public static void main(String[] args) {
        // 1. 기반 스트림(표준입력, stdin, System.in)
        BufferedReader br = null;
        // 2. 보조 스트림1 (byte|byte|byte -> char)

        // 3. 보조 스트림2 (char1|char2|char3)

        // 4. 처리
        try {
            InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
            br = new BufferedReader(isr);
            String line = null;
            while((line = br.readLine()) != null){
                if("quit".equals(line)){
                    break;
                }
                System.out.println(line);
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error : " + e);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        } finally {
            try {
                if(br != null){
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
