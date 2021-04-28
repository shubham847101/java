// java program to implement XOR-encryption

import java.io.*;
import java.util.*;

public class XOREncryption
{
	//The same function is used to encrypt and decrypt
	static String encryptDecrypt(String inputString)
	
	//Define XOR key
	//Any character value will work
	char xorKey='p';
	
	//Define String to store encrypted/decryoted String
	String outputString="";
	
	//calculate length of input string
	int len=inputString.length();
	
	//perform XOR operation of key
	//with every character is string
	for(int i=0;i<len;i++)
	{
		outputString=outputString+Character.toString((char) (inputString.charAt(i) ^ xorKey));
	}
	System.out.println(outputString);
	return outputString;
	

//Driver code
public static void main(String[] args)
{
	String sampleString="GeeksforGeeks";
	
	//Encrypt the string
	System.out.println("Encrypted String");
	String encryptedString=encryptDecrypt(sampleString);
	
	//Decrypt the string
	System.out.println("Decrypted String");
	encryptDecrypt(encryptedString);
}
}