package io;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("/Users/jay/poscodx2023/eclipse-workspace/java-study/chapter04/phone.txt");
            if (!file.exists()) {
                System.out.println("File Not Found");
                return;
            }
            System.out.println("===== 파일정보 =====");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.length() + "bytes");
            Long timestamp = file.lastModified();
            Date d = new Date(timestamp);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS");
            String date = sdf.format(d);
            System.out.println(date);

            System.out.println("===== 전화번호 =====");

            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);
            String line = null;

            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "\t ");
                int index = 0;
                while(st.hasMoreElements()){
                    String token = st.nextToken();
                    if(index == 0){
                        System.out.print(token + ":");
                    } else if (index == 1 || index == 2) {
                        System.out.print(token + "-");
                    }else{
                        System.out.print(token);
                    }
                    index++;
                }
                System.out.println();
            }
        } catch (UnsupportedEncodingException e) {
            System.out.println("Error : " + e);
        } catch (IOException e) {
            System.out.println("Error : " + e);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
