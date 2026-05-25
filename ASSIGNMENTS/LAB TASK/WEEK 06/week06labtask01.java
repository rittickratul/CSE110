public class week06labtask01{
  public static void main(String args[]){
    System.out.println("Enter your redeem code: ");
    String str = "9Abe-Coal-69UK-420i";
    String newe = "";
    for(int i =0;i<str.length();i++){
    char c = str.charAt(i);
    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
    int d = (int)c;
    d+=32;
    c=(char)d;
    newe+=c;
    }
    else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
      int d = (int)c;
    d-=32;
    c=(char)d;
    newe+=c;
    }
    else{
    newe+=c;
    }
    }
  System.out.println(newe);
  }
}