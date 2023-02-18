package javaclasses;

public class Main_Baby {

	public static void main(String[] args) {
		Baby voice =new Baby();
		voice.sound(true);
		voice.sound("open");

	}

}















//for(int i=0;i<=3;i++){
//    for(int j=0;j<=3;j++){
//        int sum = Integer.parseInt(numArray[i][j])+Integer.parseInt(numArray[i][j+1])+Integer.parseInt(numArray[i][j+2])+Integer.parseInt(numArray[i+1][j+1])+Integer.parseInt(numArray[i+2][j])+Integer.parseInt(numArray[i+2][j+1])+Integer.parseInt(numArray[i+2][j+2]);
//        if(i==0 && j==0){
//            largestSum=sum;
//        }else{
//            if(sum>largestSum){
//                largestSum=sum;
//            }