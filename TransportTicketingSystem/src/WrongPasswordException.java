
public class WrongPasswordException extends Exception {
String str1;
WrongPasswordException(String str2){
	str1=str2;
}
public String toString(){
	return ("WrongPasswordException : "+str1);
	}
}

