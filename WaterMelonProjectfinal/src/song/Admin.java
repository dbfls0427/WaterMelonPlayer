package song;

import java.util.Scanner;

import member.Member;

public class Admin extends Song {
	static public Scanner sn = new Scanner(System.in);
	
	
	public void main() {
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��           �����ڷ� ���� ���� ȯ���մϴ�.     ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("��                                                                                    ��");
		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
		System.out.println("1. ȸ��Ż���Ű��");
		System.out.println("2. �뷡 ����");
		System.out.println("3. �����޴�");
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("�Է� : ");
		num = sn.nextInt();
		sn.nextLine();
		switch(num) {
		case 1:
			memDelete();
			break;
		case 2:
			songMenu();
			break;
		case 3:
			flag = 1;
			break;
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
	
	public static void songMenu() {
		Admin ad = new Admin();
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("�����������������������������뷡 �޴�������������������������������������");
		System.out.println("�뷡 ���� �޴��Դϴ�.");
		System.out.println("1. �뷡 �߰��ϱ�");
		System.out.println("2. �뷡 �����ϱ�");
		System.out.println("3. �뷡 �����ϱ�");
		System.out.println("4. �뷡 �˻��ϱ�");
		System.out.println("5. �����޴�");
		System.out.println("������������������������������������������������������������������������������");
		System.out.print("�Է� : ");
		num = sn.nextInt();
		sn.nextLine();
		switch(num) {
		case 1:
			ad.songAdd();
			break;
		case 2:
			ad.songUpdate();
			break;
		case 3:
			ad.songDelete();
			break;
		case 4:
			ad.songSearch();
			break;
		case 5:
			flag = 1;
			break;
		default:
			System.out.println("�ٽ� �Է����ּ���.");
			break;
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
	@Override
	public boolean songAdd() {
		boolean check = false;
		SongImpl song = new SongImpl();

		System.out.println("�߰��� ������: ");
		song.setSong_singer(sn.nextLine());

		System.out.println("�߰��� �뷡����: ");
		song.setSong_name(sn.nextLine());

		System.out.println("�߰��� �뷡����: ");
		song.setSong_text(sn.nextLine());

		SongImpl.song_list.add(song);
		check = true;

		if (check == true) {
			System.out.println("�뷡�߰� ���������� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�뷡�߰� �����Ͽ����ϴ�.");
			
		}

		return check;
	}

	@Override
	public boolean songUpdate() {
		boolean check = false;

		System.out.println("������ ������: ");
		String up_name = sn.nextLine();

		for (int i = 0; i < SongImpl.song_list.size(); i++) {
			if (up_name.equals(SongImpl.song_list.get(i).getSong_singer())) {
				System.out.println("������ ������: 1.������ 2.�뷡���� 3.����");
				int num = sn.nextInt();
				sn.nextLine(); // ��������
				switch (num) {
				case 1:
					System.out.println("������ ������: ");
					String name = sn.nextLine();
					SongImpl.song_list.get(i).setSong_singer(name);
					check = true;
					break;
				case 2:
					System.out.println("������ �뷡����:");
					String songtit = sn.nextLine();
					SongImpl.song_list.get(i).setSong_name(songtit);
					check = true;
					break;
				case 3:
					System.out.println("������ ����: ");
					String txt = sn.nextLine();
					SongImpl.song_list.get(i).setSong_text(txt);
					check = true;
					break;
				}

			}
		}
		if (check == true) {
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("������ �����Ͽ����ϴ�.");
		}

		return check;
	}

	@Override
	public boolean songDelete() {
		boolean check = false;

		System.out.println("������ �뷡����: ");
		String delSong = sn.nextLine();

		for (int i = 0; i < SongImpl.song_list.size(); i++) {
			if (SongImpl.song_list.get(i).getSong_name().equals(delSong)) {
				SongImpl.song_list.remove(i);
				check = true;
				break;
			}
		}

		if (check == true) {
			System.out.println("�����Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("������ ���еǾ����ϴ�.");
		}

		return check;
	}

	@Override
	public SongImpl songSearch() {
		boolean check = false;
		SongImpl s = null;
		System.out.println("�˻��� ������: ");
		String searchName = sn.nextLine();
		
		for(int i=0; i<SongImpl.song_list.size(); i++) {
			if(SongImpl.song_list.get(i).getSong_singer().equals(searchName)) {
				s = SongImpl.song_list.get(i);

				System.out.println("�뷡����: " + s.getSong_name());
				System.out.println("������: " + s.getSong_singer());
				System.out.println("����: " + s.getSong_text());
				
				check = true;
			}
		}
		
		if(check == false) {
			System.out.println("�˻��Ͻ� ���� �����ϴ�.");
		}
		return s;
	}
	
	
	public void memDelete() {
		String id;
		System.out.print("Ż���ų ���̵� �Է����ּ��� : ");
		id = sn.nextLine();
		for(int i = 0; i < Member.mem_list.size(); i++) {
			if(id.equals(Member.mem_list.get(i).getMem_id())) {
				Member.mem_list.remove(i);
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
				break;
			}
		}
	}

}
