package song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import playList.PlayList;

public class SongImpl extends Song{
	private static Scanner sn = new Scanner(System.in);
	public static  List<SongImpl> song_list = new ArrayList<SongImpl>(); //�뷡���
	PlayList pl = new PlayList();
	
	private String song_singer; //������
	private String song_name; //�뷡����
	private String song_text;//�뷡����
	private int like; //���ƿ�
	
	
	// ����Ʈ
	public SongImpl() {
	}
	
	// ������
	public SongImpl(String song_singer, String song_name, String song_text) {
		super();
		this.song_singer = song_singer;
		this.song_name = song_name;
		this.song_text = song_text;
	}
	
	public String getSong_singer() {
		return song_singer;
	}

	public void setSong_singer(String song_singer) {
		this.song_singer = song_singer;
	}

	public String getSong_name() {
		return song_name;
	}

	public void setSong_name(String song_name) {
		this.song_name = song_name;
	}

	public String getSong_text() {
		return song_text;
	}

	public void setSong_text(String song_text) {
		this.song_text = song_text;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}
	static {
		  SongImpl song = new SongImpl();
			song.setSong_name("��鸮�� �ɵ� �ӿ���");
			song.setSong_singer("�����");
			song.setSong_text("��鸮�� �ɵ� �ӿ��� �� ��Ǫ���� �������ž�");
			song.setLike(0);
			song_list.add(song);
		  
		    SongImpl song2 = new SongImpl();
		    song2.setSong_name("���õ� ������ �ʿ���");
		    song2.setSong_singer("��ũ��");
		    song2.setSong_text("������ ���� �� �� ǳ�� �� �ʿ� �� �� ���Ӱ� �ϴ� �����ϰ� �����");
		    song2.setLike(0);
		    song_list.add(song2);
		    
		    SongImpl song3 = new SongImpl();
		    song3.setSong_name("��ĿȦ��");
		    song3.setSong_singer("�����������");
		    song3.setSong_text("�Ӹ� ���� ���� �Ȱ��� ������� �� ���� ȭ�� ���� ¥���� ���� ������ ���ְ� �ʹٰ��� ��ƴ�� ��������");
		    song3.setLike(0);
		    song_list.add(song3);
		    
		    SongImpl song4 = new SongImpl();
		    song4.setSong_name("�������� �� ��� ���� �׶���");
		    song4.setSong_singer("�Ź�");
		    song4.setSong_text("����ֳ��� ���� �� ��� ��⸦ �״� ���� �� ���� ������ ���� �׸��� �ӿ� �״븦 �ҷ�����");
		    song4.setLike(0);
		    song_list.add(song4);
		    
		    SongImpl song5 = new SongImpl();
		    song5.setSong_name("�������");
		    song5.setSong_singer("����");
		    song5.setSong_text("�׷� ���� ���� �����߾� �ؾ� ���� �߾� ���� ���� ��� �� ����߾� �ٽ� ������ ������ �߾�");
		    song5.setLike(0);
		    song_list.add(song5);
		    
		    SongImpl song6 = new SongImpl();
		    song6.setSong_name("������ ���� ��");
		    song6.setSong_singer("���̽�");
		    song6.setSong_text("������ ���� �� �׷� �ʸ� ��ٸ��� �� �� ������ �ٽ� ���� �ʸ� �������� ��");
		    song6.setLike(0);
		    song_list.add(song6);
		    
		    SongImpl song7 = new SongImpl();
		    song7.setSong_name("�õ� �ɿ� ���� �ֵ�");
		    song7.setSong_singer("HYNN");
		    song7.setSong_text("�ƹ����� �ƹ��͵� ������ �� ���� ���� �� ���ϰ� �� ���ص� �� �ܷӰ� ���� �ǰ� �� �� �ڸ�");
		    song7.setLike(0);
		    song_list.add(song7);
		    
		    SongImpl song8 = new SongImpl();
		    song8.setSong_name("�״��� ��");
		    song8.setSong_singer("�¿�");
		    song8.setSong_text("������������ �״븦 ���� ����̶�� ������ �ɱ� ���ϴ��� ���� ���� ��ó�� �������� �� �翡 �־��");
		    song8.setLike(0);
		    song_list.add(song8);
		    
		    SongImpl song9 = new SongImpl();
		    song9.setSong_name("���帶��");
		    song9.setSong_singer("Ȳ�ο�");
		    song9.setSong_text("�״�� ���� ���� �� ������ ȥ�� �� �����ϸ� ���� ������");
		    song9.setLike(0);
		    song_list.add(song9);
		    
		    SongImpl song10 = new SongImpl();
		    song10.setSong_name("�� �ҽ�");
		    song10.setSong_singer("���Ͽ�");
		    song10.setSong_text("�׶��� �츮 ��� �̰߰� ġ���ߴµ� �������� ���°� �̿�� ����� ������ ��");
		    song10.setLike(0);
		    song_list.add(song10);
		    
		    SongImpl song11 = new SongImpl();
		    song11.setSong_name("Done For Me");
		    song11.setSong_singer("��ġ");
		    song11.setSong_text("����� �ʿ��� ������� �߾������ �ٶ��� �ʿ��� ��ﵵ ���� ���ϰ� ���� �ٰ��� �� ���� �װ�");
		    song11.setLike(0);
		    song_list.add(song11);
		    
		    SongImpl song12 = new SongImpl();
		    song12.setSong_name("�� ��Ҹ� �鸮��");
		    song12.setSong_singer("��");
		    song12.setSong_text("�������� ���� ��� �־�� �״� ������ ������ �ʾƼ� �״� �տ� ���� ���� ���ִµ�");
		    song12.setLike(0);
		    song_list.add(song12);
		    
		    SongImpl song13 = new SongImpl();
		    song13.setSong_name("����");
		    song13.setSong_singer("Crush");
		    song13.setSong_text("�ƹ� �� �� �ص� �� �˰� �ִٰ� ������ô�ص� �� �巯���� �� �Ϸ����� �Լ� ������ �� ������");
		    song13.setLike(0);
		    song_list.add(song13);
		    
		    SongImpl song14 = new SongImpl();
		    song14.setSong_name("����");
		    song14.setSong_singer("����");
		    song14.setSong_text("���� ���� �׷��� ��·�� �� �Թ�ƿ� ��� ������ ���� ����");
		    song14.setLike(0);
		    song_list.add(song14);
		    
		    SongImpl song15 = new SongImpl();
		    song15.setSong_name("�� ���� �� �� �ֳ���");
		    song15.setSong_singer("������");
		    song15.setSong_text("�� ���� �� �� �ֳ��� �� �״���̿��� �״� �ڿ� �� �����Կ�");
		    song15.setLike(0);
		    song_list.add(song15);
		    
		    
	      
	      
	      
	   }
	
	public void songView() {
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("�������������������������������뷡 �޴�����������������������������������");
		System.out.println("1. �ڽ��� �뷡 �߰�");
		System.out.println("2. �뷡 ����");
		System.out.println("3. �뷡 ����");
		System.out.println("4. �뷡 �˻�");
		System.out.println("5. �뷡 ��� ���");
		System.out.println("6. �α� ���� ���(���ƿ� ��)");
		System.out.println("7. �ڽ��� �÷��̸���Ʈ");
		System.out.println("8. �����޴�");
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("�Է� : ");
		num = sn.nextInt();
		sn.nextLine();
		switch(num) {
		case 1:
			songAdd();
			break;
		case 2:
			songUpdate();
			break;
		case 3:
			songDelete();
			break;
		case 4:
			songSearch();
			break;
		case 5:
			print();
			break;
		case 6:
			sort();
			break;
		case 7:
			pl.playView();
			break;
		case 8:
			flag = 1;
			break;
		default:
			System.out.println("�ٽ� �Է����ּ���");
		}
		if(flag == 1) {
			break;
		}
			}catch(Exception e) {
				System.out.println("�ٽ� �Է����ּ���.");
				sn.nextLine();
				continue;
			}
		}
	}


    //�޼��� �뷡 �߰�
	@Override
	public boolean songAdd() {
		boolean check = false;
		SongImpl song = new SongImpl(); 
		
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("�߰��� ������ : ");
		song.setSong_singer(sn.nextLine());
		
		System.out.print("�߰��� �뷡���� : ");
		song.setSong_name(sn.nextLine());
		
		System.out.print("�߰��� �뷡���� : ");
		song.setSong_text(sn.nextLine());

		song_list.add(song); 
		check = true; 
		
		if(check == true) {
			System.out.println("�뷡�߰� ���������� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�뷡�߰� �����Ͽ����ϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
		return check;
	}
	
	//�޼��� �뷡 ����
	@Override
	public boolean songUpdate() {
		boolean check = false;
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("������ ������ : ");
		String up_name = sn.nextLine();
		
		for(int i=0; i<song_list.size(); i++) {
			if(up_name.equals(song_list.get(i).getSong_singer())) {
				System.out.println("������ ������: 1.������ 2.�뷡���� 3.����");
				int num = sn.nextInt();
				sn.nextLine(); // ��������
				switch(num) {
				case 1:
					System.out.print("������ ������ : ");
					String name = sn.nextLine();
					song_list.get(i).setSong_singer(name);
					check = true;
					break;
				case 2:
					System.out.print("������ �뷡���� :");
					String songtit = sn.nextLine();
					song_list.get(i).setSong_name(songtit);
					check = true;
					break;
				case 3:
					System.out.print("������ ���� : ");
					String txt = sn.nextLine();
					song_list.get(i).setSong_text(txt);
					check = true;
					break;
				}
				
			}
		}
		if(check==true) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�Է��Ͻ� �뷡�� �������� �ʽ��ϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
		return check;
	}
	
	//�޼��� �뷡 ����
	@Override
	public boolean songDelete() {
		boolean check = false;
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("������ �뷡���� : ");
		String delSong = sn.nextLine();

		for(int i=0; i< song_list.size(); i++) {
			if(song_list.get(i).song_name.equals(delSong)) {
				song_list.remove(i);
				check = true;
				break;
			}
		}
		
		if(check == true) {
			System.out.println("�����Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�Է��Ͻ� �뷡�� �������� �ʽ��ϴ�.");
		}
		System.out.println("������������������������������������������������������������������������������");
		return check;
	}
	
	//�޼��� �뷡 �˻�
	@Override
	public SongImpl songSearch() {
		boolean check = false;
		SongImpl s = null;
		System.out.print("�˻��� ������ : ");
		String searchName = sn.nextLine();
		System.out.println("������������������������������������������������������������������������������");
		for(int i=0; i<song_list.size(); i++) {
			if(song_list.get(i).getSong_singer().equals(searchName)) {
				s = song_list.get(i);

				System.out.println("�뷡����: " + s.getSong_name());
				System.out.println("������: " + s.getSong_singer());
				System.out.println("����: " + s.getSong_text());
				
				check = true;
			}
		}
		System.out.println("������������������������������������������������������������������������������");
		
		if(check == false) {
			System.out.println("�˻��Ͻ� ���� �����ϴ�.");
		}
		return s;
	}
	
	public void print() {
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("            ���� �뷡 ����Դϴ�.");
		System.out.println("������������������������������������������������������������������������������");
		for(int i=0; i<song_list.size(); i++) {
			System.out.println("�뷡 �̸� : "+ song_list.get(i).getSong_name() + " ���� �̸� : " + song_list.get(i).getSong_singer() + " ���ƿ� �� : " + song_list.get(i).getLike());
		}
	}
	
	public void sort() {
		List<SongImpl> sortSong = song_list;
		sortSong.sort(new Comparator<SongImpl>() {
			@Override
			public int compare(SongImpl o1, SongImpl o2) {
				// TODO Auto-generated method stub
				return o1.getLike() > o2.getLike() ? -1 : o1.getLike() < o2.getLike() ? 1 : 0;
			}
		});
		System.out.println("������������������������������������������������������������������������������");
		System.out.println("             �뷡 �α� �����Դϴ�.");
		System.out.println("������������������������������������������������������������������������������");
		for(int i = 0; i < sortSong.size(); i++) {
			System.out.println((i+1) + "�� �뷡 �̸� : " + sortSong.get(i).getSong_name()+ " ���ƿ� : " + sortSong.get(i).getLike());
		}
	}


	
	
}
