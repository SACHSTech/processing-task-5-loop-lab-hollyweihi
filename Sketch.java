import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import processing.core.PApplet;

public class Sketch extends PApplet {
	

  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  public void setup() {
    background(45, 150, 207);
  }

  public void draw() {

    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
int intY = 0;
int squareSize = 5; 
int numRows = 37; 
int numColumns = 37; 

for (int intRow = 0; intRow < numRows; intRow++) {
  for (int intColumn = 0; intColumn < numColumns; intColumn++) {
    intX = 3 + intRow * (squareSize + 3);
    intY = 300 + 3 + intColumn * (squareSize + 3);

    fill(255);
    noStroke();
    rect(intX, intY, squareSize, squareSize);
      }
    }
  }

  public void draw_section2(){

    int intX = 0;
    int intY = 0;
    int squareSize = 5; 
    int numRows = 37;
    int numColumns = 37;
    int xOffset = 300; 
    
    for (int intRow = 0; intRow < numRows; intRow++) {
      for (int intColumn = 0; intColumn < numColumns; intColumn++) {
        intX = 3 + intRow * (squareSize + 3) + xOffset; // Apply the offset here
        intY = 300 + 3 + intColumn * (squareSize + 3);
    
        if (intRow % 2 == 0) {
          // If the row index is even, draw a white square
          fill(255);
        } else {
          // If the row index is odd, draw a black square
          fill(0);
        }
    
        noStroke();
        rect(intX, intY, squareSize, squareSize);
      }
    }
  }
  public void draw_section3(){

    int intX = 0;
    int intY = 0;
    int squareSize = 5; 
    int numRows = 37;
    int numColumns = 37;
    int xOffset = 600; // Adjust this value to control the horizontal offset
    
    for (int intRow = 0; intRow < numRows; intRow++) {
      for (int intColumn = 0; intColumn < numColumns; intColumn++) {
        intX = 3 + intRow * (squareSize + 3) + xOffset; // Apply the offset here
        intY = 300 + 3 + intColumn * (squareSize + 3);
    
        if (intColumn % 2 == 0) {
          // If the row index is even, draw a white square
          fill(255);
        } else {
          // If the row index is odd, draw a black square
          fill(0);
        }
    
        noStroke();
        rect(intX, intY, squareSize, squareSize);
      }
    }
  }
  public void draw_section4(){
  int intX = 0;
  int intY = 0;
  int squareSize = 5; 
  int numRows = 37;
  int numColumns = 37;
  int xOffset = 900; // Adjust this value to control the horizontal offset
  boolean isBlackRow = true;
  boolean isBlackColumn = true;
  
  for (int intRow = 0; intRow < numRows; intRow++) {
    isBlackRow = !isBlackRow;
    isBlackColumn = true; // Reset the column color for each new row
    
    for (int intColumn = 0; intColumn < numColumns; intColumn++) {
      intX = 3 + intRow * (squareSize + 3) + xOffset;
      intY = 300 + 3 + intColumn * (squareSize + 3);
  
      if (isBlackRow || isBlackColumn) {
        // If either the row or the column is black, draw a black square
        fill(0);
      } else {
        // Otherwise, draw a white square
        fill(255);
      }
  
      noStroke();
      rect(intX, intY, squareSize, squareSize);
      isBlackColumn = !isBlackColumn; // Toggle the column color
    }
  }
}

public void draw_section5() {
  int squareSize = 5; 
  int spacing = 3; 
  int numSquares = 37; 
  int xOffset = 303; 
  int yOffset = 5; 
  
  for (int row = 0; row < numSquares; row++) { 
    for (int col = 0; col <= row; col++) { 
      int x = xOffset + col * (squareSize + spacing); 
      int y = yOffset + row * (squareSize + spacing); 
      fill(255);
      rect(x, y, squareSize, squareSize); 
    } 
  } 
}

public void draw_section6() {
  int squareSize = 5; 
  int spacing = 3; 
  int numSquares = 37; 
  int xOffset = 3; 
  int yOffset = 5; 
  
  for (int row = 0; row < numSquares; row++) { 
    for (int col = numSquares - row; col < numSquares; col++) { 
      int x = xOffset + col * (squareSize + spacing); 
      int y = yOffset + row * (squareSize + spacing); 
      fill(255); 
      rect(x, y, squareSize, squareSize); 
    } 
  } 
}

public void draw_section7() {
    int squareSize = 5; 
  int spacing = 3; 
  int numSquares = 37; 
  int xOffset = 600; 
  int yOffset = 0; 
  
  for (int row = numSquares - 1; row >= 0; row--) { 
    for (int col = 0; col <= row; col++) { 
      int x = xOffset + col * (squareSize + spacing); 
      int y = yOffset + (numSquares - row - 1) * (squareSize + spacing); 
      fill(255);
      rect(x, y, squareSize, squareSize); 
    } 
  } 
}

public void draw_section8() {
  int squareSize = 5; 
  int spacing = 3; 
  int numSquares = 60; 
  int xOffset = 900; 
  int yOffset = 0; 
  
  for (int row = numSquares - 1; row >= 0; row--) { 
    for (int col = numSquares - row; col < numSquares; col++) { 
      int x = xOffset + col * (squareSize + spacing); 
      int y = yOffset + (numSquares - row - 1) * (squareSize + spacing); 
      fill(255); 
      rect(x, y, squareSize, squareSize); 
    } 
  }
}
}
