package song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import playList.PlayList;

public class SongImpl extends Song{
	private static Scanner sn = new Scanner(System.in);
	public static  List<SongImpl> song_list = new ArrayList<SongImpl>(); //노래목록
	PlayList pl = new PlayList();
	
	private String song_singer; //가수명
	private String song_name; //노래제목
	private String song_text;//노래가사
	private int like; //좋아요
	
	
	// 디폴트
	public SongImpl() {
	}
	
	// 생성자
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
			song.setSong_name("흔들리는 꽃들 속에서");
			song.setSong_singer("장범준");
			song.setSong_text("흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야");
			song.setLike(0);
			song_list.add(song);
		  
		    SongImpl song2 = new SongImpl();
		    song2.setSong_name("오늘도 빛나는 너에게");
		    song2.setSong_singer("마크툽");
		    song2.setSong_text("별빛이 내린 밤 그 풍경 속 너와 나 날 새롭게 하는 따뜻하게 만드는");
		    song2.setLike(0);
		    song_list.add(song2);
		    
		    SongImpl song3 = new SongImpl();
		    song3.setSong_name("워커홀릭");
		    song3.setSong_singer("볼빨간사춘기");
		    song3.setSong_text("머릴 질끈 묶고 안경을 벗어던져 난 지금 화가 났음 짜증이 났음 답장을 해주고 싶다가도 쏘아대는 말투들이");
		    song3.setLike(0);
		    song_list.add(song3);
		    
		    SongImpl song4 = new SongImpl();
		    song4.setSong_name("기억해줘요 내 모든 날과 그때를");
		    song4.setSong_singer("거미");
		    song4.setSong_text("듣고있나요 나의 이 모든 얘기를 그댈 향한 내 깊은 진심을 매일 그리움 속에 그대를 불러보지");
		    song4.setLike(0);
		    song_list.add(song4);
		    
		    SongImpl song5 = new SongImpl();
		    song5.setSong_name("헤어지자");
		    song5.setSong_singer("휘인");
		    song5.setSong_text("그럴 수도 있지 생각했어 잊어 보려 했어 지난 날의 모든 걸 노력했어 다시 시작해 보려고 했어");
		    song5.setLike(0);
		    song_list.add(song5);
		    
		    SongImpl song6 = new SongImpl();
		    song6.setSong_name("가을밤 떠난 너");
		    song6.setSong_singer("케이시");
		    song6.setSong_text("가을밤 떠난 너 그런 너를 기다리는 나 그 계절은 다시 돌아 너를 생각나게 해");
		    song6.setLike(0);
		    song_list.add(song6);
		    
		    SongImpl song7 = new SongImpl();
		    song7.setSong_name("시든 꽃에 물을 주듯");
		    song7.setSong_singer("HYNN");
		    song7.setSong_text("아무말도 아무것도 여전히 넌 여기 없고 널 원하고 널 원해도 난 외롭고 꽃이 피고 진 그 자리");
		    song7.setLike(0);
		    song_list.add(song7);
		    
		    SongImpl song8 = new SongImpl();
		    song8.setSong_name("그대라는 시");
		    song8.setSong_singer("태연");
		    song8.setSong_text("언제부터인지 그대를 보면 운명이라고 느꼈던 걸까 밤하늘의 별이 빛난 것처럼 오랫동안 내 곁에 있어요");
		    song8.setLike(0);
		    song_list.add(song8);
		    
		    SongImpl song9 = new SongImpl();
		    song9.setSong_name("포장마차");
		    song9.setSong_singer("황인욱");
		    song9.setSong_text("그대와 자주 가던 그 술집에 혼자 널 생각하며 소주 한잔해");
		    song9.setLike(0);
		    song_list.add(song9);
		    
		    SongImpl song10 = new SongImpl();
		    song10.setSong_name("니 소식");
		    song10.setSong_singer("송하예");
		    song10.setSong_text("그때의 우리 사랑 뜨겁고 치열했는데 끝나보니 남는건 미움뿐 몇번의 계절을 더");
		    song10.setLike(0);
		    song_list.add(song10);
		    
		    SongImpl song11 = new SongImpl();
		    song11.setSong_name("Done For Me");
		    song11.setSong_singer("펀치");
		    song11.setSong_text("지울게 너에게 남겨줬던 추억까지도 바랄게 너와의 기억도 남지 못하게 더는 다가갈 수 없어 네게");
		    song11.setLike(0);
		    song_list.add(song11);
		    
		    SongImpl song12 = new SongImpl();
		    song12.setSong_name("내 목소리 들리니");
		    song12.setSong_singer("벤");
		    song12.setSong_text("오랫동안 나는 울고 있어요 그대 마음이 보이지 않아서 그대 앞에 내가 여기 서있는데");
		    song12.setLike(0);
		    song_list.add(song12);
		    
		    SongImpl song13 = new SongImpl();
		    song13.setSong_name("나빠");
		    song13.setSong_singer("Crush");
		    song13.setSong_text("아무 말 안 해도 다 알고 있다고 괜찮은척해도 다 드러나는 걸 뾰로통한 입술 차가운 네 말투에");
		    song13.setLike(0);
		    song_list.add(song13);
		    
		    SongImpl song14 = new SongImpl();
		    song14.setSong_name("날라리");
		    song14.setSong_singer("선미");
		    song14.setSong_text("말해 뭐해 그랬니 어쨌니 또 입방아에 들썩 온종일 난리 법석");
		    song14.setLike(0);
		    song_list.add(song14);
		    
		    SongImpl song15 = new SongImpl();
		    song15.setSong_name("내 맘을 볼 수 있나요");
		    song15.setSong_singer("헤이즈");
		    song15.setSong_text("내 맘을 볼 수 있나요 난 그대뿐이에요 그대 뒤에 나 있을게요");
		    song15.setLike(0);
		    song_list.add(song15);
		    
		    
	      
	      
	      
	   }
	
	public void songView() {
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("━━━━━━━━━━━━━━━노래 메뉴━━━━━━━━━━━━━━━━━");
		System.out.println("1. 자신의 노래 추가");
		System.out.println("2. 노래 수정");
		System.out.println("3. 노래 삭제");
		System.out.println("4. 노래 검색");
		System.out.println("5. 노래 목록 출력");
		System.out.println("6. 인기 순위 목록(좋아요 순)");
		System.out.println("7. 자신의 플레이리스트");
		System.out.println("8. 이전메뉴");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
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
			System.out.println("다시 입력해주세요");
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


    //메서드 노래 추가
	@Override
	public boolean songAdd() {
		boolean check = false;
		SongImpl song = new SongImpl(); 
		
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("추가할 가수명 : ");
		song.setSong_singer(sn.nextLine());
		
		System.out.print("추가할 노래제목 : ");
		song.setSong_name(sn.nextLine());
		
		System.out.print("추가할 노래가사 : ");
		song.setSong_text(sn.nextLine());

		song_list.add(song); 
		check = true; 
		
		if(check == true) {
			System.out.println("노래추가 성공적으로 완료되었습니다.");
		} else {
			System.out.println("노래추가 실패하였습니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		return check;
	}
	
	//메서드 노래 수정
	@Override
	public boolean songUpdate() {
		boolean check = false;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("수정할 가수명 : ");
		String up_name = sn.nextLine();
		
		for(int i=0; i<song_list.size(); i++) {
			if(up_name.equals(song_list.get(i).getSong_singer())) {
				System.out.println("수정할 사항은: 1.가수명 2.노래제목 3.가사");
				int num = sn.nextInt();
				sn.nextLine(); // 공백제거
				switch(num) {
				case 1:
					System.out.print("수정할 가수명 : ");
					String name = sn.nextLine();
					song_list.get(i).setSong_singer(name);
					check = true;
					break;
				case 2:
					System.out.print("수정할 노래제목 :");
					String songtit = sn.nextLine();
					song_list.get(i).setSong_name(songtit);
					check = true;
					break;
				case 3:
					System.out.print("수정할 가사 : ");
					String txt = sn.nextLine();
					song_list.get(i).setSong_text(txt);
					check = true;
					break;
				}
				
			}
		}
		if(check==true) {
			System.out.println("수정이 완료되었습니다.");
		}else {
			System.out.println("입력하신 노래는 존재하지 않습니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		return check;
	}
	
	//메서드 노래 삭제
	@Override
	public boolean songDelete() {
		boolean check = false;
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("삭제할 노래제목 : ");
		String delSong = sn.nextLine();

		for(int i=0; i< song_list.size(); i++) {
			if(song_list.get(i).song_name.equals(delSong)) {
				song_list.remove(i);
				check = true;
				break;
			}
		}
		
		if(check == true) {
			System.out.println("삭제완료되었습니다.");
		} else {
			System.out.println("입력하신 노래는 존재하지 않습니다.");
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		return check;
	}
	
	//메서드 노래 검색
	@Override
	public SongImpl songSearch() {
		boolean check = false;
		SongImpl s = null;
		System.out.print("검색할 가수명 : ");
		String searchName = sn.nextLine();
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for(int i=0; i<song_list.size(); i++) {
			if(song_list.get(i).getSong_singer().equals(searchName)) {
				s = song_list.get(i);

				System.out.println("노래제목: " + s.getSong_name());
				System.out.println("가수명: " + s.getSong_singer());
				System.out.println("가사: " + s.getSong_text());
				
				check = true;
			}
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		
		if(check == false) {
			System.out.println("검색하신 곡이 없습니다.");
		}
		return s;
	}
	
	public void print() {
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("            현재 노래 목록입니다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for(int i=0; i<song_list.size(); i++) {
			System.out.println("노래 이름 : "+ song_list.get(i).getSong_name() + " 가수 이름 : " + song_list.get(i).getSong_singer() + " 좋아요 수 : " + song_list.get(i).getLike());
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
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.println("             노래 인기 순위입니다.");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		for(int i = 0; i < sortSong.size(); i++) {
			System.out.println((i+1) + "등 노래 이름 : " + sortSong.get(i).getSong_name()+ " 좋아요 : " + sortSong.get(i).getLike());
		}
	}


	
	
}
