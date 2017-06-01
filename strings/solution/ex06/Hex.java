package strings.solution.ex06;

import java.io.IOException;

import net.mindview.util.BinaryFile;

public class Hex {
	public static String format(byte[] data){
		StringBuilder s = new StringBuilder();
		int addr = 0;
		// 一行 16个字节
		while(addr < data.length){
			s.append(String.format("%04o", addr));
			for(int i = 0; i < 16 ; i++){
				if(addr + i < data.length){
					s.append(" ");
					s.append(String.format("%02x",data[addr + i])) ;
				}else{
					break;
				}
			}
			s.append("\n");
			addr += 16;
		}
		return s.toString();
	}
	public static void main(String[] args){
		try {
			System.out.println(format(BinaryFile.read("strings/solution/ex06/Hex.java")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
