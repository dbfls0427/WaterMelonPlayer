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
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("★                                                                                    ★");
		System.out.println("☆                                                                                    ☆");
		System.out.println("★                                                                                    ★");
		System.out.println("☆                                                                                    ☆");
		System.out.println("★           관리자로 오신 것을 환영합니다.     ★");
		System.out.println("☆                                                                                    ☆");
		System.out.println("★                                                                                    ★");
		System.out.println("☆                                                                                    ☆");
		System.out.println("★                                                                                    ★");
		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
		System.out.println("1. 회원탈퇴시키기");
		System.out.println("2. 노래 관리");
		System.out.println("3. 이전메뉴");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
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
				System.out.println("다시 입력해주세요.");
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
		System.out.println("━━━━━━━━━━━━━━노래 메뉴━━━━━━━━━━━━━━━━━━");
		System.out.println("노래 관리 메뉴입니다.");
		System.out.println("1. 노래 추가하기");
		System.out.println("2. 노래 수정하기");
		System.out.println("3. 노래 삭제하기");
		System.out.println("4. 노래 검색하기");
		System.out.println("5. 이전메뉴");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
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
			System.out.println("다시 입력해주세요.");
			break;
		}
		if(flag == 1) {
			break;
		}
			}catch(Exception e) {
				System.out.println("다시 입력해주세요.");
				sn.nextLine();
				continue;
			}
		}
	}
	@Override
	public boolean songAdd() {
		boolean check = false;
		SongImpl song = new SongImpl();

		System.out.println("추가할 가수명: ");
		song.setSong_singer(sn.nextLine());

		System.out.println("추가할 노래제목: ");
		song.setSong_name(sn.nextLine());

		System.out.println("추가할 노래가사: ");
		song.setSong_text(sn.nextLine());

		SongImpl.song_list.add(song);
		check = true;

		if (check == true) {
			System.out.println("노래추가 성공적으로 완료되었습니다.");
		} else {
			System.out.println("노래추가 실패하였습니다.");
			
		}

		return check;
	}

	@Override
	public boolean songUpdate() {
		boolean check = false;

		System.out.println("수정할 가수명: ");
		String up_name = sn.nextLine();

		for (int i = 0; i < SongImpl.song_list.size(); i++) {
			if (up_name.equals(SongImpl.song_list.get(i).getSong_singer())) {
				System.out.println("수정할 사항은: 1.가수명 2.노래제목 3.가사");
				int num = sn.nextInt();
				sn.nextLine(); // 공백제거
				switch (num) {
				case 1:
					System.out.println("수정할 가수명: ");
					String name = sn.nextLine();
					SongImpl.song_list.get(i).setSong_singer(name);
					check = true;
					break;
				case 2:
					System.out.println("수정할 노래제목:");
					String songtit = sn.nextLine();
					SongImpl.song_list.get(i).setSong_name(songtit);
					check = true;
					break;
				case 3:
					System.out.println("수정할 가사: ");
					String txt = sn.nextLine();
					SongImpl.song_list.get(i).setSong_text(txt);
					check = true;
					break;
				}

			}
		}
		if (check == true) {
			System.out.println("수정이 완료되었습니다.");
		} else {
			System.out.println("수정이 실패하였습니다.");
		}

		return check;
	}

	@Override
	public boolean songDelete() {
		boolean check = false;

		System.out.println("삭제할 노래제목: ");
		String delSong = sn.nextLine();

		for (int i = 0; i < SongImpl.song_list.size(); i++) {
			if (SongImpl.song_list.get(i).getSong_name().equals(delSong)) {
				SongImpl.song_list.remove(i);
				check = true;
				break;
			}
		}

		if (check == true) {
			System.out.println("삭제완료되었습니다.");
		} else {
			System.out.println("삭제가 실패되었습니다.");
		}

		return check;
	}

	@Override
	public SongImpl songSearch() {
		boolean check = false;
		SongImpl s = null;
		System.out.println("검색할 가수명: ");
		String searchName = sn.nextLine();
		
		for(int i=0; i<SongImpl.song_list.size(); i++) {
			if(SongImpl.song_list.get(i).getSong_singer().equals(searchName)) {
				s = SongImpl.song_list.get(i);

				System.out.println("노래제목: " + s.getSong_name());
				System.out.println("가수명: " + s.getSong_singer());
				System.out.println("가사: " + s.getSong_text());
				
				check = true;
			}
		}
		
		if(check == false) {
			System.out.println("검색하신 곡이 없습니다.");
		}
		return s;
	}
	
	
	public void memDelete() {
		String id;
		System.out.print("탈퇴시킬 아이디를 입력해주세요 : ");
		id = sn.nextLine();
		for(int i = 0; i < Member.mem_list.size(); i++) {
			if(id.equals(Member.mem_list.get(i).getMem_id())) {
				Member.mem_list.remove(i);
				System.out.println("삭제가 완료되었습니다.");
				break;
			}
		}
	}

}
