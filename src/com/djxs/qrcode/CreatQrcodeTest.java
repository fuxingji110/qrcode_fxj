package com.djxs.qrcode;
import java.io.IOException;

import com.djxs.util.*;
public class CreatQrcodeTest {
    public static void main(String[]args) throws IOException{
    	QrcodeTest.J_CreateQrcode(5, 'Q', "科技2班付兴基", "D:/logo.jpg", 30, "D:/二维码生成.png", "17,189,229", "160,50,168");
    }
}
