package main;

import entity.NPC_Ryker;
import monster.MON_Crab;
import monster.MON_GhostBoss;
import monster.MON_Orc;
import monster.MON_Ryker;
import monster.MON_Wiz;
import monster.MON_ghost;
import monster.MON_ghost_temp;
import monster.MON_spider;
import object.OBJ_Axe;
import object.OBJ_Chest;
import object.OBJ_Coin_Bronze;
import object.OBJ_Hpotion;
import object.OBJ_Mshield;
import object.OBJ_RKey;
import object.OBJ_SpeedPotion;
import object.OBJ_door;
import tile_interactive.IT_BrTree;
import tile_interactive.IT_PShopD;
import tile_interactive.IT_Portal;
import tile_interactive.IT_TShopD;

public class AssetSetter {
	
	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}

	public void setObject() {
		
		int mapNum = 0;
		int i = 0;
		
		i++;
	}
	public void setNPC() {
		
		int mapNum = 0;
		
	}
	public void setMonster() {
		
		int mapNum = 0;
		int i = 0;
		
		gp.monster[mapNum][i] = new MON_ghost_temp(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*37;
		gp.monster[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
		mapNum = 3;
		
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*18;
		gp.monster[mapNum][i].worldY = gp.tileSize*43;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*19;
		gp.monster[mapNum][i].worldY = gp.tileSize*44;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*40;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*4;
		gp.monster[mapNum][i].worldY = gp.tileSize*35;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*37;
		gp.monster[mapNum][i].worldY = gp.tileSize*44;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*37;
		gp.monster[mapNum][i].worldY = gp.tileSize*46;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*41;
		gp.monster[mapNum][i].worldY = gp.tileSize*46;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*47;
		gp.monster[mapNum][i].worldY = gp.tileSize*46;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*31;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*32;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*6;
		gp.monster[mapNum][i].worldY = gp.tileSize*16;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*36;
		gp.monster[mapNum][i].worldY = gp.tileSize*21;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*35;
		gp.monster[mapNum][i].worldY = gp.tileSize*4;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*10;
		gp.monster[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
		mapNum = 4;
		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*4;
		gp.monster[mapNum][i].worldY = gp.tileSize*36;
		i++;
		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*16;
		gp.monster[mapNum][i].worldY = gp.tileSize*44;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*32;
		gp.monster[mapNum][i].worldY = gp.tileSize*45;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*29;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*39;
		gp.monster[mapNum][i].worldY = gp.tileSize*27;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*19;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*11;
		gp.monster[mapNum][i].worldY = gp.tileSize*13;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*28;
		gp.monster[mapNum][i].worldY = gp.tileSize*5;
		i++;
		

		gp.monster[mapNum][i] = new MON_GhostBoss(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*20;
		gp.monster[mapNum][i].worldY = gp.tileSize*2;
		i++;

		
		mapNum = 5;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*16;
		gp.monster[mapNum][i].worldY = gp.tileSize*43;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*45;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*18;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*6;
		gp.monster[mapNum][i].worldY = gp.tileSize*18;
		i++;
		
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*14;
		gp.monster[mapNum][i].worldY = gp.tileSize*14;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*43;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*46;
		gp.monster[mapNum][i].worldY = gp.tileSize*12;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*28;
		gp.monster[mapNum][i].worldY = gp.tileSize*18;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*16;
		gp.monster[mapNum][i].worldY = gp.tileSize*7;
		i++;
		
		gp.monster[mapNum][i] = new MON_Orc(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*20;
		gp.monster[mapNum][i].worldY = gp.tileSize*2;
		i++;
		mapNum = 6;
		
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*7;
		gp.monster[mapNum][i].worldY = gp.tileSize*31;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*11;
		gp.monster[mapNum][i].worldY = gp.tileSize*44;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*47;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*25;
		gp.monster[mapNum][i].worldY = gp.tileSize*47;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*26;
		gp.monster[mapNum][i].worldY = gp.tileSize*45;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*26;
		gp.monster[mapNum][i].worldY = gp.tileSize*41;
		i++;
		gp.monster[mapNum][i] = new MON_spider(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*15;
		gp.monster[mapNum][i].worldY = gp.tileSize*31;
		i++;
		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*15;
		gp.monster[mapNum][i].worldY = gp.tileSize*35;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*43;
		gp.monster[mapNum][i].worldY = gp.tileSize*40;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*40;
		gp.monster[mapNum][i].worldY = gp.tileSize*34;
		i++;
		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*46;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*37;
		gp.monster[mapNum][i].worldY = gp.tileSize*25;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*31;
		gp.monster[mapNum][i].worldY = gp.tileSize*26;
		i++;
		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*28;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*45;
		gp.monster[mapNum][i].worldY = gp.tileSize*30;
		i++;

		gp.monster[mapNum][i] = new MON_ghost(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*38;
		gp.monster[mapNum][i].worldY = gp.tileSize*17;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*28;
		gp.monster[mapNum][i].worldY = gp.tileSize*13;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*15;
		gp.monster[mapNum][i].worldY = gp.tileSize*15;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*17;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*15;
		gp.monster[mapNum][i].worldY = gp.tileSize*24;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*9;
		gp.monster[mapNum][i].worldY = gp.tileSize*11;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*40;
		gp.monster[mapNum][i].worldY = gp.tileSize*5;
		i++;
		gp.monster[mapNum][i] = new MON_Crab(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*23;
		gp.monster[mapNum][i].worldY = gp.tileSize*11;
		i++;
		gp.monster[mapNum][i] = new MON_Wiz(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*4;
		i++;
		
		mapNum = 7;
		gp.monster[mapNum][i] = new MON_Ryker(gp);
		gp.monster[mapNum][i].worldX = gp.tileSize*24;
		gp.monster[mapNum][i].worldY = gp.tileSize*11;
		i++;
	}
	public void setInteractiveTile() {
		
		int mapNum = 0;
		int i = 0;
		gp.iTile[mapNum][i] = new IT_Portal(gp,16,34);i++;
		gp.iTile[mapNum][i] = new IT_BrTree(gp,30,23);i++;
		gp.iTile[mapNum][i] = new IT_BrTree(gp,30,22);i++;
		gp.iTile[mapNum][i] = new IT_PShopD(gp,12,19);i++;
		gp.iTile[mapNum][i] = new IT_TShopD(gp,17,11);i++;
	}
}
