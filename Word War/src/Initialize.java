//package Word_war;
import java.util.*;
public class Initialize
{
	
		// TODO Auto-generated method stub
		// Eq_1  ~ Eq_20 	���u�C���O 		�Dpower ��speed
		// Eq_20 ~ Eq_40	�}��			�Dspeed ��power
		// Eq_41 ~ Eq_60	�u�M�P�����M	�Dlucky ��speed
		// Eq_61 ~ Eq_65	����_�M�A_���q
		// Eq_66 ~ Eq_68	����_�M�A_�C�h
		// Eq_69 ~ Eq_71	����_�M�A_�}�b��
		// Eq_72 ~ Eq_75	����_�M�A_�s��
		// Eq_76 ~ Eq_85	����_�ܭ�
		
		/*----------------------------���u�C���O ------------------------------*/
		Equipment Eq_1 =new Equipment("��C",100,5,0,0,0);
		Equipment Eq_2 =new Equipment("���C",400,10,0,0,0);
		Equipment Eq_3 =new Equipment("�j�a���C",800,15,0,0,50);
		Equipment Eq_4 =new Equipment("���M",800,10,0,10,0);
		Equipment Eq_5 =new Equipment("�ɭ����C",1500,40,0,20,0);
		Equipment Eq_6 =new Equipment("��������",1500,40,0,0,200);
		Equipment Eq_7 =new Equipment("�r�����b",2000,40,40,0,0);
		Equipment Eq_8 =new Equipment("���ڰ��M",2000,40,40,0,0);
		Equipment Eq_9 =new Equipment("�f�����̤��C",3000,80,0,50,0);
		Equipment Eq_10 =new Equipment("�護�P��",3200,80,50,0,50);	
		Equipment Eq_11 =new Equipment("�L�ɤ��b",3800,120,0,0,0);
		Equipment Eq_12 =new Equipment("�P�K�s�M",4200,150,50,100,0);
		Equipment Eq_13 =new Equipment("���S���b",4200,150,100,50,0);
		Equipment Eq_14 =new Equipment("�·t�B��",4800,150,0,0,500);
		Equipment Eq_15 =new Equipment("�������",5200,180,0,50,800);
		Equipment Eq_16 =new Equipment("�i�̤��C",5800,250,0,100,500);
		Equipment Eq_17 =new Equipment("�Ͳ����C",5800,250,100,0,500);
		Equipment Eq_18 =new Equipment("�ͺ����b",7600,450,100,0,800);
		Equipment Eq_19 =new Equipment("�������C",8500,1000,0,0,0);
		Equipment Eq_20 =new Equipment("�u�@���C",9200,800,200,200,2000);
		/*----------------------------���u�C���O ------------------------------*/
		/*------------------------------�}��--------------------------------*/
		Equipment Eq_21 =new Equipment("��}",100,2,0,4,0);
		Equipment Eq_22 =new Equipment("�K�}",400,5,0,10,0);
		Equipment Eq_23 =new Equipment("���}",600,8,0,15,50);
		Equipment Eq_24 =new Equipment("�԰��}",800,10,0,10,0);
		Equipment Eq_25 =new Equipment("���K���}",1500,15,0,25,0);
		Equipment Eq_26 =new Equipment("�������}",1500,0,0,40,0);
		Equipment Eq_27 =new Equipment("�����ɧV",2000,30,0,40,0);
		Equipment Eq_28 =new Equipment("�V�P��Ĥ��}",2300,30,0,50,0);
		Equipment Eq_29 =new Equipment("�V�P������",2800,35,0,60,0);
		Equipment Eq_30 =new Equipment("�]�i����{���}",3200,40,0,70,0);
		Equipment Eq_31 =new Equipment("�i�Ĥ���",3800,60,0,80,0);
		Equipment Eq_32 =new Equipment("�g�ɪ��p���}",4200,60,0,150,0);
		Equipment Eq_33 =new Equipment("�ë��߹p��",4200,80,0,120,0);
		Equipment Eq_34 =new Equipment("�����Z�p���}",4800,100,0,180,0);
		Equipment Eq_35 =new Equipment("���贵�}�ѩ�",5200,100,0,200,0);
		Equipment Eq_36 =new Equipment("���J����",5800,120,0,300,0);
		Equipment Eq_37 =new Equipment("���������}",5800,100,0,320,0);
		Equipment Eq_38 =new Equipment("�]�i����{����",6600,120,0,500,0);
		Equipment Eq_39 =new Equipment("��������",8500,100,0,1000,0);
		Equipment Eq_40 =new Equipment("�ɭ����g���}",9200,150,0,1200,2000);
		/*------------------------------�}��--------------------------------*/
		/*---------------------------�u�M�P�����M------------------------------*/
		Equipment Eq_41 =new Equipment("�s��u�C",100,0,5,2,0);
		Equipment Eq_42 =new Equipment("�T���b",400,0,10,5,0);
		Equipment Eq_43 =new Equipment("�����b",800,0,12,10,0);
		Equipment Eq_44 =new Equipment("���K�u�M",1000,0,20,10,0);
		Equipment Eq_45 =new Equipment("���r�s�骺�P��",1500,0,30,20,0);
		Equipment Eq_46 =new Equipment("�k�����l�b",1500,0,30,15,200);
		Equipment Eq_47 =new Equipment("���]�O�s�P��",2000,0,45,30,0);
		Equipment Eq_48 =new Equipment("�\�@�L���_���b",2300,0,50,30,0);
		Equipment Eq_49 =new Equipment("�����u�M",3200,0,65,40,0);
		Equipment Eq_50 =new Equipment("�������ǻ��C�s��M",3400,0,70,30,0);
		Equipment Eq_51 =new Equipment("�Ҥ����M",3800,0,90,50,0);
		Equipment Eq_52 =new Equipment("���l�f�b",4200,0,120,80,0);
		Equipment Eq_53 =new Equipment("��Ū�R���ٱ��M",4500,0,150,50,0);
		Equipment Eq_54 =new Equipment("���������ɭ��s�M",4800,0,220,0,0);
		Equipment Eq_55 =new Equipment("�p����ڶ�Լw",5200,0,200,120,0);
		Equipment Eq_56 =new Equipment("���q�p����M",5800,0,250,200,0);
		Equipment Eq_57 =new Equipment("����s�骺�P��",6200,0,300,150,0);
		Equipment Eq_58 =new Equipment("���t���ȵu�C",7500,0,400,300,0);
		Equipment Eq_59 =new Equipment("�������ǻ��P���u�b",8500,0,1000,0,0);
		Equipment Eq_60 =new Equipment("ı�����p����ڶ�Լw",9200,0,1200,1000,2000);
		/*---------------------------�u�M�P�����M------------------------------*/		
		/*--------------------------����_�M�A_���q-----------------------------*/
		Equipment Eq_61 =new Equipment("���Q�a��",1200,10,10,10,100);
		Equipment Eq_62 =new Equipment("�W�j�F���M��",2000,15,15,15,200);
		Equipment Eq_63 =new Equipment("�p�C�B�ʪA",3600,30,30,30,300);
		Equipment Eq_64 =new Equipment("���몺�q���M��",4800,40,40,40,500);
		Equipment Eq_65 =new Equipment("�覡���B§�A",5500,50,50,50,800);
		/*--------------------------����_�M�A_���q-----------------------------*/
		/*--------------------------����_�M�A_�C�h-----------------------------*/
		Equipment Eq_66 =new Equipment("��l�ߧηҺ��Z��",6800,100,0,0,1500);
		Equipment Eq_67 =new Equipment("�����Z�p���԰��M��",8800,200,0,0,3000);
		Equipment Eq_68 =new Equipment("�Ұ�^���Z��",10200,500,0,0,5000);
		/*--------------------------����_�M�A_�C�h-----------------------------*/
		/*--------------------------����_�M�A_�}�b��----------------------------*/
		Equipment Eq_69 =new Equipment("�����y�H�A",6800,0,0,120,1000);
		Equipment Eq_70 =new Equipment("�j�s�n�����Z��",8800,0,0,250,2000);
		Equipment Eq_71 =new Equipment("�Ұ�U�Q�Z��",10200,0,0,600,4500);
		/*--------------------------����_�M�A_�}�b��----------------------------*/
		/*--------------------------����_�M�A_�s��-----------------------------*/
		Equipment Eq_72 =new Equipment("�g����̲����Z��",6800,0,150,0,800);
		Equipment Eq_73 =new Equipment("�ë��g�ܪA",8800,0,300,20,1000);
		Equipment Eq_74 =new Equipment("�~����{����",10200,0,650,0,3000);
		Equipment Eq_75 =new Equipment("�L�W��",16800,800,800,800,8000);
		/*--------------------------����_�M�A_�s��-----------------------------*/		
		/*---------------------------����_�ܭ�-------------------------------*/
		Equipment Eq_76 =new Equipment("�d���ܯS���ܭ�",2200,30,10,20,200);
		Equipment Eq_77 =new Equipment("�¦�u�@�ܭ�",2200,20,10,30,200);
		Equipment Eq_78 =new Equipment("���ǩܭ�",2200,10,30,20,200);
		Equipment Eq_79 =new Equipment("����\�ȩܭ�",4600,60,20,40,500);
		Equipment Eq_80 =new Equipment("�x�s���ܭ�",4600,40,20,60,500);
		Equipment Eq_81 =new Equipment("�`�Ŧ���R�����O",4600,20,60,40,500);
		Equipment Eq_82 =new Equipment("���s�ܭ�",8800,150,50,80,800);
		Equipment Eq_83 =new Equipment("���xĥ�����ܭ�",8800,80,50,150,800);
		Equipment Eq_84 =new Equipment("�\�@�L������ܭ�",8800,50,150,80,800);
		Equipment Eq_85 =new Equipment("�ѯT�P�ܭ�",9600,150,150,150,1500);
		/*---------------------------����_�ܭ�-------------------------------*/		
		
		// TODO Auto-generated method stub
		// Mt_1  ~ Mt_20 	�j��Ǫ��ܧ����O
		// Mt_21 ~ Mt_60	��u�H�c�����O
		// Mt_61 ~ Mt_85	�s�@�ζ��ܨ����O
		
		/*----------------------------�j��Ǫ��ܧ����O ------------------------------*/
		static Monster Mt_1 =new Monster("�p�v�ܩi",10,5,5*20,2); 
		static Monster Mt_2 =new Monster("�v�ܩi",15,10,5*20,5);
		static Monster Mt_3 =new Monster("�¥v�ܩi",15,10,7*20,7);
		static Monster Mt_4 =new Monster("Ū�Ѫ��v�ܩi",20,15,10*20,10);
		static Monster Mt_5 =new Monster("�o�����v�ܩi",20,20,20*20,20);
		static Monster Mt_6 =new Monster("�g�{�����v�ܩi",25,30,30*20,20);
		static Monster Mt_7 =new Monster("�i�б¥v�ܩi",40,50,100*30,50);
		static Monster Mt_boss1=new Monster("�v�ܩi����",100,100,300*40,200);
		static Monster Mt_8 =new Monster("�p���",10,5,5*20,2);
		static Monster Mt_9 =new Monster("���",15,10,5*20,5);
		static Monster Mt_10 =new Monster("�z���",15,10,7*20,7);
		static Monster Mt_11 =new Monster("�޵P���",20,15,10*20,10);
		static Monster Mt_12 =new Monster("ĵ����",25,30,30*20,20);
		static Monster Mt_13 =new Monster("���`�ΫO�ߤ��",40,50,100*30,50);
		static Monster Mt_boss2=new Monster("�짯��",100,100,300*40,200);
		static Monster Mt_14 =new Monster("�p����",10,5,5*20,2);
		static Monster Mt_15 =new Monster("����",15,10,5*20,5);
		static Monster Mt_16 =new Monster("�p�k�ħ���",15,10,7*20,7);
		static Monster Mt_17 =new Monster("�������",20,15,10*20,10);
		static Monster Mt_18 =new Monster("�¨�����",20,20,20*20,20);
		static Monster Mt_19 =new Monster("OL����",25,30,30*20,20);
		static Monster Mt_20 =new Monster("�B�ժ������ѧ���",40,50,100*30,50);
		static Monster Mt_boss3=new Monster("����λ�",100,100,300*40,200);
		
		/*----------------------------�j��Ǫ��ܧ����O ------------------------------*/
		/*---------------------------- ��u�H�c�����O -------------------------------*/
		static Monster Mt_21 =new Monster("C�y��",50,10,10*20,5);  
		static Monster Mt_22 =new Monster("��}Pythom",50,15,10*20,5);
		static Monster Mt_23 =new Monster("�U�c����",50,10,15*20,5);
		static Monster Mt_24 =new Monster("Java�Ѫ�",60,20,20*20,10);
		static Monster Mt_25 =new Monster("Java�Ѫ��ͪ���l",60,25,20*20,10);
		static Monster Mt_26 =new Monster("�ݤ�����CPE",70,30,30*30,20);
		static Monster Mt_27 =new Monster("�ݷݪ��ťթ�",70,40,30*30,30);
		static Monster Mt_28 =new Monster("�ݷݪ��g�k�J",70,30,40*30,30);
		static Monster Mt_29 =new Monster("�ݷݪ��_���J",70,35,35*30,30);
		static Monster Mt_30 =new Monster("�ݷݪ��j��è",100,50,40*30,40);
		static Monster Mt_31 =new Monster("�ݷݪ������Ѥ~",100,30,60*30,40);
		static Monster Mt_32 =new Monster("VHDL�ݷ�",1000,700,500*40,200);
		static Monster Mt_33 =new Monster("�d������",500,200,400*40,100);
		static Monster Mt_34 =new Monster("���q�u����",500,300,300*40,100);
		static Monster Mt_35 =new Monster("�x�W�����S�S",500,100,500*40,100);
		static Monster Mt_36 =new Monster("�p�����j�f��",100,70,40*30,50);
		static Monster Mt_37 =new Monster("�j�f���p��",500,400,300*40,100);
		static Monster Mt_38 =new Monster("���ܪ����f",500,500,200*40,100);
		static Monster Mt_39 =new Monster("���滷�誺����",500,500*40,100*30,100);
		static Monster Mt_40 =new Monster("�Q½�઺CC",1000,700,600*50,200);
		static Monster Mt_41 =new Monster("�M�jJJ",1000,600,700*60,200);
		static Monster Mt_42 =new Monster("���c�ڶ��W�б�",800,600,500*40,150);
		static Monster Mt_43 =new Monster("���c�ڶ����б�",1000,500,700*60,200);
		static Monster Mt_44 =new Monster("�U��ָ���",1500,800,800*60,250);
		static Monster Mt_45 =new Monster("�Ӥ�����",50,5,20*20,5);
		static Monster Mt_46 =new Monster("�ʤ�����",50,10,20*20,5);
		static Monster Mt_47 =new Monster("�෽�ի�u",100,50,40*30,30);
		static Monster Mt_48 =new Monster("�o�⤧�����u",100,60,30*30,30);
		static Monster Mt_49 =new Monster("���b���O����",200,100,100*30,40);
		static Monster Mt_50 =new Monster("�Q���Ϫ��O����",300,200,200*40,40);
		static Monster Mt_51 =new Monster("�N�J���O����",400,300,200*40,50);
		static Monster Mt_52 =new Monster("�\�w�����I",100,40,50*30,5);
		static Monster Mt_53 =new Monster("�K���q��",200,150,50*30,40);
		static Monster Mt_54 =new Monster("�L�Ҥ��b���Դ��Դ�",500,500,100*30,150);
		static Monster Mt_55 =new Monster("�����h���ť߸�",500,400,200*40,150);
		static Monster Mt_56 =new Monster("Trivially�ҩ��D",500,100,500*40,150);
		static Monster Mt_57 =new Monster("�I�������^���r",600,500,300*40,150);
		static Monster Mt_58 =new Monster("�g�������{���X",600,400,400*40,150);
		static Monster Mt_59 =new Monster("�ڷ����ƻs�K�W",600,200,600*50,150);
		static Monster Mt_60 =new Monster("�L�Ѫ�Deadlock",1000,600,700*60,200); 
		/*---------------------------- ��u�H�c�����O -------------------------------*/
		/*--------------------------- �s�@�ζ��ܨ����O ------------------------------*/
		static Monster Mt_61 =new Monster("�p�ڥ���",500,400,300*40,90);
		static Monster Mt_62 =new Monster("�ڥ���",500,450,350*40,100);
		static Monster Mt_63 =new Monster("�s���c���}���ڥ���",700,500,400*40,130);
		static Monster Mt_64 =new Monster("��ۤ�򥧪��ڥ���",700,550,350*40,140);
		static Monster Mt_65 =new Monster("½�ղ����ڥ���",1000,700,700*60,170);
		static Monster Mt_66 =new Monster("�L�`���ڥ���",1000,700,800*60,200);
		static Monster Mt_67 =new Monster("�Ʒ|���ڥ���",2000,900,1000*70,300);
		static Monster Mt_68 =new Monster("�p����",500,200,500*40,90);
		static Monster Mt_69 =new Monster("����",500,300,500*40,100);
		static Monster Mt_70 =new Monster("�s�����f�ʪ�����",700,400,500*40,150);
		static Monster Mt_71 =new Monster("�Q�ǭS�S������",1000,600,800*60,170);
		static Monster Mt_72 =new Monster("�Q�ǭS�S����������",1000,700,800*60,200);
		static Monster Mt_73 =new Monster("����������",2000,800,1000*70,300);
		static Monster Mt_74 =new Monster("�p���æ�",500,350,250*40,90);
		static Monster Mt_75 =new Monster("���æ�",1000,650,550*50,180);
		static Monster Mt_76 =new Monster("�p�x§�W",500,450,350*40,100);
		static Monster Mt_77 =new Monster("�x§�W",1000,800,600*50,200);
		static Monster Mt_78 =new Monster("�p���T��",500,350,450*40,100);
		static Monster Mt_79 =new Monster("���T��",1000,800,600*50,180);
		static Monster Mt_80 =new Monster("�p�P�E��",500,500,300*40,90);
		static Monster Mt_81 =new Monster("�ީީP�E��",500,500,400*40,100);
		static Monster Mt_82 =new Monster("�T�ѨS�Ϊ��P�E��",1000,750,650*60,180);
		static Monster Mt_83 =new Monster("�����~�o���ʤ@�ˤj���P�E��",1000,800,700*60,200);
		static Monster Mt_84 =new Monster("�ަ��H��PM�P�E��",2000,1000,1000*70,300);
		static Monster Mt_85 =new Monster("����L��ɪ�Word War�s�@�H��",5000,10000,1000000,5000);
		static Monster Mt_86 =new Monster("�\��",99999,99999999,9999999,9999999);

//------------------------�H�U���a��------------------------		
		
		static Monster[] group0={Mt_1,Mt_2,Mt_3,Mt_8,Mt_9,Mt_10,Mt_14,Mt_15,Mt_16};
		static Monster[] group1={Mt_1,Mt_2,Mt_3,Mt_4,Mt_5,Mt_6,Mt_7,Mt_boss1};
		static Monster[] group2={Mt_8,Mt_9,Mt_10,Mt_11,Mt_12,Mt_13,Mt_boss2};
		static Monster[] group3={Mt_14,Mt_15,Mt_16,Mt_17,Mt_18,Mt_19,Mt_20,Mt_boss3};
		static Monster[] group4={Mt_21,Mt_22,Mt_24,Mt_23,Mt_25,Mt_26};
		static Monster[] group5={Mt_27,Mt_28,Mt_29,Mt_30,Mt_31,Mt_32};
		static Monster[] group6={Mt_33,Mt_34,Mt_35,Mt_36,Mt_37,Mt_38,Mt_39,Mt_40,Mt_41,Mt_42,Mt_43,Mt_44};
		static Monster[] group7={Mt_45,Mt_46,Mt_47,Mt_48,Mt_49,Mt_50,Mt_51,Mt_52,Mt_53};
		static Monster[] group8={Mt_54,Mt_55,Mt_56,Mt_57,Mt_58,Mt_59,Mt_60};
		static Monster[] group9={Mt_61,Mt_62,Mt_63,Mt_64,Mt_65,Mt_66,Mt_67};
		static Monster[] group10={Mt_68,Mt_69,Mt_70,Mt_71,Mt_72,Mt_73};
		static Monster[] group11={Mt_73,Mt_74,Mt_75,Mt_76,Mt_77,Mt_78,Mt_79,Mt_80,Mt_81,Mt_82,Mt_83,Mt_84,Mt_85,Mt_86};
		static Map newuser=new Map("�s���",group0);
		static Map jungle1=new Map("�_���˪L",group1);
		static Map jungle2=new Map("�賡�˪L",group2);
		static Map jungle3=new Map("�F���˪L",group3);
		static Map jungle4=new Map("�n���˪L",group1,group2,group3);
		static Map classroom1=new Map("�������q���Ы�",group4);
		static Map classroom2=new Map("�]�Ƶw������",group5);
		static Map classroom3=new Map("��u�t��",group6);
		static Map classroom4=new Map("�Q��Ѫ��q��������",group7);
		static Map classroom5=new Map("�a������",group8);
		static Map studio1=new Map("�کg�����_�ۥ@��",group9);
		static Map studio2=new Map("�����ܺA�ж�",group10);
		static Map studio3=new Map("�@�ɪ����Y",group11);
	
	public static ArrayList<String> battle_string(final Monster mon)
	{
		final ArrayList<String> bs=new ArrayList<String>();
		String[] saber={"�A�����","�ļ�����","����","�C���a��","�ۭ���","���","�}�ѼC","�L���C","��ű�"};
		String[] archer={"���q�g��","�}��","����","�z���b","�b�B","��߽b","�ɭ����g","�·t����","�g�ѯT"};
		String[] thief={"�I��","�rŧ","����","�j�۱�","�r��","����ŧ��","������","���Bŧ��","�t�v�g��"};
		String[] monster={"�Q������","�񧾧���","�J�ا���","���r����","�ļ�","�O�����z������","�차�f�r","�R���f�r","�t�z�_��"};
		int ch_life=Charc.life;
		int mon_life=mon.ShowLife();
		while (true)
		{	
			
			String cs="",ms="";
			int index=(int)(1000*Math.random()%saber.length);
			int index_1=(int)(1000*Math.random()%saber.length);
			int lv_temp=Charc.level;
			if (mon.ShowName().compareTo("�\��")==0)
				lv_temp=999;
			double atk=a(Charc.ATK,index,Charc.level);
			double matk=a(mon.ShowAttack(),index_1,lv_temp);
			
			cs+=Charc.name+" �� "+mon.ShowName()+" �I�i�F ";
			if (Charc.carceer.compareTo("�C�h")==0)
				cs+=b(saber,index,Charc.level);
			else if (Charc.carceer.compareTo("�}�b��")==0)
				cs+=b(archer,index,Charc.level);
			else
				cs+=b(thief,index,Charc.level);
			cs+=" �y�� "+(int)atk+" �I�ˮ`...";
			bs.add(cs);
			
			mon_life-=(int)atk;
			
			if (mon_life<=0)
			{
				bs.add("�A���� "+mon.ShowName()+"...");
				bs.add(Charc.name+" Ĺ�o�F�ӧQ!!!");
				break;
			}
			
			ms+=mon.ShowName()+" �� "+Charc.name+" �I�i�F ";
			ms+=b(monster,index_1,lv_temp);
			ms+=" �y�� "+(int)matk+" �I�ˮ`...";
			bs.add(ms);
			
			ch_life-=matk;
			
			if (ch_life<=0)
			{
				bs.add(""+mon.ShowName()+" ���ѧA...");
				bs.add("�A���`�F!!!");
				break;
			}
		}
		
		return bs;
	}
	
	public static String b(String[] s,int index,int lv)
	{
		if (lv>=60)
			return s[index];
		if (lv>=40)
			return s[index%6];
		if (lv>=20)
			return s[index%3];
		return s[index%2];
	}
	public static double a(double atk,int index,int lv)
	{
		if (lv!=0&&lv!=999)
		{
			if (lv<5)
				return atk;
			else if (lv<20)
			{
				if (index%6>2)
					if (index%6==5)
						return 1.3*atk;
					else
						return 1.1*atk;
				else
					return 0.9*atk;
			}
			else if (lv<40)
			{
				if (index%6>2)
					if (index%6==5)
						return 1.5*atk;
					else
						return 1.25*atk;
				else
					return atk;
			}
			else
			{
				if (index>2&&index<5)
					return 1.25*atk;
				else if(index==5)
					return 1.5*atk;
				else if (index==7)
					return 2*atk;
				else if (index>2)
					return 1.5*atk;
				else 
					return atk;		
			}
		}
		else
		{
			if (lv==999)
			{
				if (index==8)
					return atk*2;
				if (index>5)
					return atk*1.3;
				if (index>2)
					return 1.15*atk;
				return atk;
			}
			else
			{
				if (index>5)
					return atk*1.3;
				if (index>2)
					return 1.15*atk;
				return atk;
			}
		}
	}
}