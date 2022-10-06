package main;

import entity.NPC_Ryker;
import object.OBJ_Chest;
import object.OBJ_RKey;
import object.OBJ_SpeedPotion;
import object.OBJ_door;

public class AssetSetter {
	
	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}

	public void setObject() {
		
		gp.obj[0] = new OBJ_door(gp);
		gp.obj[0].worldX = gp.tileSize * 14;
		gp.obj[0].worldY = gp.tileSize * 8;
		
	}
	public void setNPC() {
		
		gp.npc[0] = new NPC_Ryker(gp);
		gp.npc[0].worldX =gp.tileSize*7;
		gp.npc[0].worldY = gp.tileSize*8;
	}
}
