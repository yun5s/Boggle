package com;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoggleTest {
	String word;
	@Before
	public void setUp() throws Exception {
	}
	@Test
	public void test() {
			word = "EEAE";
			char[][] board = {
		            {'I','L','A','W'},
		            {'B','N','G','E'},
		            {'I','U','A','O'}, 
		            {'A','S','R','L'}
		            };
		            
	System.out.println("The String:"+word+" is " + Boggle3.valid(board,word));
		        }
	@Test
	public void testLargerBoard(){
		
	//case bigger array && longer string
		word = "GURSALEYLAUASR";
		char[][] board = {
            {'I','T','B','L','A','W'},
            {'P','G','U','E','Q','W'},
            {'S','T','R','S','A','L'},  
            {'B','N','G','L','I','E'},
            {'I','U','A','O','Y','U'}, 
            {'A','S','R','L','U','I'}
            };
		assertEquals(true, Boggle3.valid(board,word));
		System.out.println("The String:"+word+" is " + Boggle3.valid(board,word));
	}

	@Test
	//tall board
	public void testTallBoard(){

		word = "INARS";
		char[][] board = {
            {'I','L','A','W'},
            {'B','N','G','E'},
            {'I','U','A','O'}, 
            {'A','S','R','L'},
            };
		assertEquals(true, Boggle3.valid(board,word));
		System.out.println("The String:"+word+" is " + Boggle3.valid(board,word));

	}

	@Test
	//adjacent string is across the board

	public void testWrongAns(){

		word = "NBEG";
		char[][] board = {
            {'I','L','A','W'},
            {'B','N','G','E'},
            {'I','U','A','O'}, 
            {'A','S','R','L'}
            };
		assertEquals(false, Boggle3.valid(board,word));
		System.out.println("The String:"+word+" is " + Boggle3.valid(board,word));

		}
	}

