package tile_interactive;

import java.awt.Color;

import entity.Entity;
import main.GamePanel;

public class IT_TShopD extends InteractiveTile{
	
	GamePanel gp;

	public IT_TShopD(GamePanel gp, int col, int row) {
		super(gp,col,row);
		this.gp = gp;
	
		this.worldX = gp.tileSize * col;
		this.worldY = gp.tileSize * row;
		
		down1 = setup("/tiles_interactive/trader_shop_close_door_95", gp.tileSize,gp.tileSize);
		destructible = true;
		life = 2000;
	}
	public boolean isCorrectItem(Entity entity) {
		boolean isCorrectItem = false;
		
		if(entity.currentWeapon.type == type_axe) {
			isCorrectItem = true;
		}
		
		return isCorrectItem;
	}
	public void playSE() {
		gp.playSE(11);
	}
	public InteractiveTile getDestroyedForm() {
		InteractiveTile tile = null;
		return tile;
	}
	public Color getParticleColor() {
		
		Color color = new Color(0,0,0);
		return color;
	}
	public int getParticleSize() {
		int size = 6;
		return size;
	}
	public int getParticleSpeed() {
		int speed = 1;
		return speed;
	}
	public int getParticleMaxLife() {
		int maxLife = 20;
		return maxLife;
	}

}
