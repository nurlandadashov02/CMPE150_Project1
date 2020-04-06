
public class Stickman {
	
	public static int count;
	
	public static void main(String[] args) {
		// Assigning arguments to variables
		int stickmanHeight = Integer.parseInt(args[0]);
		int stairHeight = Integer.parseInt(args[1]);
		//printing final image
		printImage(stairHeight, stickmanHeight);
	}
	
	public static void repeat(String s, int times) { 
		// prints given string  given number of times
		for(int i = 0; i < times; i++) {
			System.out.print(s);
		}
	}
	
	public static void printImage(int stairheight, int SMheight) {
		// count variable determines number of frames
		for(count = 0; count < stairheight + 1; count++) { 
			//prints empty lines above stickman's head
			emptyLines(stairheight, SMheight);
			//prints sticman's head and hands
			printHead_Arms(stairheight, SMheight);
			//prints stickmas torso with stairs as well as legs
			printTorso_Stairs(stairheight, SMheight);
			//prints 3 empty lines after first stair			
			System.out.println("\n\n");
		}
	}
	
	public static void emptyLines(int stairheight, int SMheight) { 
		//prints empty lines above stickman's head
		repeat("\n",stairheight - count);
	}
	
	public static void printHead_Arms(int stairheight, int SMheight) { 
		//empty spaces before and after head
		repeat(" ", count * 3 + 1);
		System.out.print("O");	
		
		System.out.print(" ");
		//new line
		System.out.println();
		//empty spaces before and after arms
		repeat(" ",count * 3);
		System.out.print("/|\\");
		
		//new line
		System.out.println();
	}
	
	public static void printTorso_Stairs(int stairheight, int SMheight) {
		//prints | that are in lines without stairs
		for(int i = 0; i < SMheight - (stairheight + 1) - 2 + count ; i++) {
			//empty spaces before and after torso(|)
			repeat(" ", count * 3 + 1);
			System.out.print("|");
			
			System.out.print(" ");
			//new line
			System.out.println();
		}
		//prints all torso lines (excluding legs and stairs after legs)
		for(int j = 0; j < stairheight - count; j++) {
			// empty spaces before torso and after torso but before stairs
			repeat(" ", count * 3 + 1);
			System.out.print("|");
			repeat(" ", 8 + 3 * stairheight - 6 - (count * 3 + 1) - j * 3);
			//part of stairs
			System.out.print("___"); 
			System.out.print("|");
			//stars
			repeat("*", j * 3);
			//end of line
			System.out.print("|");
			System.out.println();
		}
		//prints legs
		repeat(" ",count * 3);
		System.out.print("/ \\");
		//part of stairs
		System.out.print("___"); 
		System.out.print("|");
		//stars
		repeat("*", 8 + 3 * stairheight - 5 - (count + 1)* 3);
		//end of line
		System.out.print("|");
		System.out.println();
		//lines of stairs after legs
		for(int k = 0; k < count ; k++) {
			repeat(" ",count * 3 - k * 3 );
			//part of stairs
			System.out.print("___"); 
			System.out.print("|");
			//stars
			repeat("*", 8 + 3 * stairheight - 5 - count * 3 + k * 3);
			//end of line
			System.out.print("|");
			System.out.println();
		}
	}
}