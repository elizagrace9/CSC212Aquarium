package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
		//Every fish has an x which is an int
		int x;
		int y;
		Color color;
		boolean isLittle;
		boolean facingLeft;
		//Every fish has a destination
		int destX;
		int destY;
		
		
		public Fish(Color c, int startX, 
				int startY, boolean isLittle) {
			this.color = c;
			this.x = startX;
			this.y = startY;
			this.isLittle = isLittle;
			
			this.destX = 450;
			this.destY = 450;
		}
		
		//Fix this, destX statement completely incomplete
		public void swim() {
			if (this.y < destY) {
			this.y += 1;
			}
			if (this.x < destX) {
			}
		}
			
		
		public void draw(Graphics2D g) {
			this.swim();
			//Assumption that fish face left and are small
			//facingRight, facingLeft, and facingRight
			DrawFish.smallFacingLeft(g, 
					this.color, this.x, this.y);
			Draw
			
		//if statements go here
			
			
		}
			
		}
}
