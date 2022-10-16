package main;

import java.awt.Rectangle;

public class EventHandler {
	
	GamePanel gp;
	EventRect eventRect[][];
	
	int previousEventX, previousEventY;
	boolean canTouchEvent = true;
	
	public EventHandler(GamePanel gp) {
		this.gp = gp;
		
		eventRect = new EventRect[gp.maxWorldCol][gp.maxWorldRow];
		
		int col = 0;
		int row = 0;
		while(col < gp.maxWorldCol && row < gp.maxWorldRow) {
			
			eventRect[col][row] = new EventRect();
			eventRect[col][row].x = 23;
			eventRect[col][row].y = 23;
			eventRect[col][row].width = 2;
			eventRect[col][row].height = 2;
			eventRect[col][row].eventRectDefaultX = eventRect[col][row].x;
			eventRect[col][row].eventRectDefaultY = eventRect[col][row].y;
			
			col++;
			if(col == gp.maxWorldCol) {
				col = 0;
				row++;
			}
		}
	}
	
	public void checkEvent() {
		
		int xDistance = Math.abs(gp.player.worldX - previousEventX);
		int yDistance = Math.abs(gp.player.worldY - previousEventY);
		int distance = Math.max(xDistance, yDistance);
		if(distance > gp.tileSize) {
			canTouchEvent=true;
		}
		
		if(canTouchEvent == true) {
			
			if(hit(14,8,"down")==true) { damagePit(14,8,gp.dialougeState); }
			if(hit(17,6,"any")==true) { healingPool(17,6,gp.dialougeState); }
			if(hit(6,1,"any")==true) { teleport(6,1,gp.dialougeState); }
		}
	}
	
	public boolean hit(int col,int row,String reqDirection) {
		
		boolean hit = false;
		
		gp.player.solidArea.x = gp.player.worldX + gp.player.solidArea.x;
		gp.player.solidArea.y = gp.player.worldY + gp.player.solidArea.y;
		eventRect[col][row].x = col*gp.tileSize + eventRect[col][row].x;
		eventRect[col][row].y = row*gp.tileSize + eventRect[col][row].y;
		
		if(gp.player.solidArea.intersects(eventRect[col][row]) && eventRect[col][row].eventDone == false){
			
			if(gp.player.direction.contentEquals(reqDirection) || reqDirection.contains("any")) {
				
				hit = true;
				
				previousEventX = gp.player.worldX;
				previousEventY = gp.player.worldY;
				
			}
		}
		
		gp.player.solidArea.x = gp.player.solidAreaDefaultX;
		gp.player.solidArea.y = gp.player.solidAreaDefaultY;
		eventRect[col][row].x = eventRect[col][row].eventRectDefaultX;
		eventRect[col][row].y = eventRect[col][row].eventRectDefaultY;
		
		return hit;
	}
	public void teleport(int col,int row,int gameState) {
		
		gp.gameState = gameState;
		gp.ui.currentDialogue = "Teleport!";
		gp.player.worldX = gp.tileSize*21;
		gp.player.worldY = gp.tileSize*4;
	}
	public void damagePit(int col,int row,int gameState) {
		
		gp.gameState = gameState;
		gp.playSE(6);
		gp.ui.currentDialogue = "You fell into a pit!";
		gp.player.life -= 1;
		canTouchEvent = false;
		
	}
	public void healingPool(int col,int row,int gameState) {
		
		if(gp.keyH.enterPressed == true) {
			gp.player.attackCanceled = true;
			gp.playSE(2);
			gp.gameState = gameState;
			gp.ui.currentDialogue = "You recovered your health and mana!";
			gp.player.life = gp.player.maxLife;
			gp.player.mana = gp.player.maxMana;
			gp.aSetter.setMonster();
		}
	}

}
