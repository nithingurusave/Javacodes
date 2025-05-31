package org.xogame;
import java.util.Scanner;
public class XOgameAI {
	private static char currentplayer='X';
	private static char computer='O';
	private static char[]board= {'1','2','3','4','5','6','7','8','9'};
public static void main(String[] args) {
	System.out.println("enter game mode");
	System.out.println("enter 1 for player vs player");
	System.out.println("enter 2 for player vs computer");
	Scanner scan=new Scanner(System.in);
	int choice;
	
	do {
	choice=scan.nextInt();
	switch(choice) {
	case 1:
		playPlayervsPlayer();
		break;
	
	case 2:
		playPlayervsComputer();
		break;

	default:
		System.out.println("not a valid choice");
		break;
	}
	}
	while(choice>2);
	scan.close();

}

private static void playPlayervsPlayer() {
	while(true) {
	initializeboard(board);
	playgame();
	if(checkwin(currentplayer, board)) {
		initializeboard(board);
		System.out.println(currentplayer+"- wins the game");
		break;
	}
	if(checkdraw(board)) {
		initializeboard(board);
		System.out.println("game is draw");
		break;
	}
	if(!checkwin(currentplayer, board)&&!checkdraw(board))
	changeplayer();
	}
}


private static void playPlayervsComputer() {
	while(true) {
	initializeboard(board);
	playgame();
	
	if(!checkwin(currentplayer, board)&&!checkdraw(board))
	AImove(board);
	if(checkwin(currentplayer, board)) {
		initializeboard(board);
		System.out.println(currentplayer+"- wins the game");
		break;
	}
	if(checkdraw(board)) {
		initializeboard(board);
		System.out.println("game is draw");
		break;
	}
	}
	
}



private static void initializeboard(char[] board) {
	
	System.out.println(" |"+board[0]+" |"+board[1]+" |"+board[2]+" |");
	System.out.println(" ----------");
	System.out.println(" |"+board[3]+" |"+board[4]+" |"+board[5]+" |");
	System.out.println(" ----------");
	System.out.println(" |"+board[6]+" |"+board[7]+" |"+board[8]+" |");
	
	
}

private static boolean checkwin(char currentplayer,char[] board) {
	//rows
	if(board[0]==currentplayer&&board[1]==currentplayer&&board[2]==currentplayer||
		board[3]==currentplayer&&board[4]==currentplayer&&board[5]==currentplayer||
		board[6]==currentplayer&&board[7]==currentplayer&&board[8]==currentplayer)
	return true;
	//column
	else if(board[0]==currentplayer&&board[3]==currentplayer&&board[6]==currentplayer||
		board[1]==currentplayer&&board[4]==currentplayer&&board[7]==currentplayer||
		board[2]==currentplayer&&board[5]==currentplayer&&board[8]==currentplayer)
	return true;
	//diagonal
	else if(board[0]==currentplayer&&board[4]==currentplayer&&board[8]==currentplayer||
		board[2]==currentplayer&&board[4]==currentplayer&&board[6]==currentplayer)
	return true;
	
	return false;
	
}

private static boolean checkdraw(char[] board) {
	for(int i=0;i<9;i++) {
		if(board[i]!='X'&&board[i]!='O') {
		return false;
		}
	}
	return true;
}

private static void playgame() {
	while(true) {
	System.out.println("enter value betweeen 1-9");
	System.out.println(currentplayer+"  turn");
	Scanner scan=new Scanner(System.in);
	char input = (char)(scan.nextInt()-1);
	if(Character.isDigit(board[input])) {
		board[input]=currentplayer;
		break;
	}
	else {
		System.out.println("invalid move try some other value");
	}
	}
}

private static void changeplayer() {
	currentplayer=currentplayer=='X'?'O':'X';
	
}

private static void AImove(char[] board) {
	//makes the AI win
	for(int i=0;i<9;i++) {
		if(board[i]!='X'&&board[i]!='O') {
		board[i]='O';
		if(checkwin(computer, board)) {
			currentplayer=computer;
			return;
		}
		else {
			board[i]=Character.forDigit(i+1,10);//retrive the original value 
		}	
		}
	}
	//blocks the players move
	for(int i=0;i<9;i++) {
		if(board[i]!='X'&&board[i]!='O') {
		board[i]='X';
		if(checkwin(currentplayer, board)) {
			board[i]='O';
			return;
		}
		else {
			board[i]=Character.forDigit(i+1,10);//Alternatively we can use (char)(i+1)
		}	
		}
	}
	//if center is free
	if(board[4]!='X'&&board[4]!='O') {
		board[4]=computer;
		return;
	}
	//if corners are free
		if(board[0]!='X'&&board[0]!='O') {
			board[0]=computer;
			return;
		}
		else if(board[2]!='X'&&board[2]!='O') {
			board[2]=computer;
			return;
		}
		else if(board[6]!='X'&&board[6]!='O') {
			board[6]=computer;
			return;
		}
		else if(board[8]!='X'&&board[8]!='O') {
			board[8]=computer;
			return;
		}
}

}

