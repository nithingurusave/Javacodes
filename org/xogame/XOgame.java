package org.xogame;
import java.util.Scanner;
public class XOgame {
	private static final char EMPTY=' ';
	private static final char PLAYER_X='X';
	private static final char PLAYER_O='O';
	private static char[][] board=new char[3][3];
	private static char currentplayer=PLAYER_X;
	private static boolean player=true;
	
public static void main(String[] args) {
	intialization();
	gameplay();
}
private static void intialization() {
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<3;j++) {
			board[i][j]=EMPTY;
		}
		
	}
	
}
	
private static void gameplay() {
	while(true) {
	displayboard();
	playersmove();
	checkwon();
	if(checkwon()) {
		System.out.format("%4s",(currentplayer+" - won the game"));
		break;
		}
	checkdraw();
	if(checkdraw()) {
		System.out.println("game is draw");
		break;
	}
	if(!checkdraw()&&!checkwon()) {
	changeplayer();
	}
	}
   }
	


private static void displayboard() {
for(int i=0;i<3;i++) {
		System.out.print("|");
		for(int j=0;j<3;j++) {
//			board[i][j]=EMPTY;
			System.out.print(board[i][j]+" |");
		}
		System.out.println();
		System.out.println("----------");
	}

}

private static boolean checkwon() {
	//boolean won=true;
	for(int i=0;i<3;i++) {
	if((board[0][i]==currentplayer&&board[1][i]==currentplayer&&board[2][i]==currentplayer)||(board[i][0]==currentplayer&&board[i][1]==currentplayer&&board[i][2]==currentplayer)){
		return true;
	}	

	else if((board[0][0]==currentplayer&&board[1][1]==currentplayer&&board[2][2]==currentplayer)||(board[0][2]==currentplayer&&board[1][1]==currentplayer&&board[2][0]==currentplayer)) {
		return true;
	}
	}
	return false;
	
}

private static boolean checkdraw() {
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			if(board[i][j]==EMPTY) {
				return false;
			}
		}
	}
	return true;
}


private static void playersmove() {
	Scanner scan=new Scanner(System.in);
	while(true) {
	System.out.println("enter row value from 1,2,3");
	char row = (char) ((char) scan.nextInt()-1);
	System.out.println("enter column value from 1,2,3");
	char column = (char) ((char) scan.nextInt()-1);
	
	if((row>=0&&row<=2&&column>=0&&column<=2)&&board[row][column]==EMPTY){
		board[row][column]=currentplayer;
	    player=true;
		break;
	}
	else {
		System.out.println("invalid move try with some other values");
	    player=false;
		break;
	}
	}
	}
	private static void changeplayer() {
	if(player) {
		//System.out.println(player);
	currentplayer=(currentplayer==PLAYER_X)?PLAYER_O:PLAYER_X;
	}
	else {
		//System.out.println(player);
		currentplayer=currentplayer;
	}
	}

}



