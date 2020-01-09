package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import song.Admin;
import song.SongImpl;
import ticket.Ticket;


public class Member {
	static Scanner sc = new Scanner(System.in);
	public static List<Member> mem_list =new ArrayList<Member>();
	static String on_id; //로그인한 아이디
	static String on_pw; //로그인한 비밀번호
	static Admin admin = new Admin();
	static SongImpl song = new SongImpl();
	static Ticket ti = new Ticket();
	
	private String mem_id; //회원 아이디
	private String mem_name; //회원 이름
	private String mem_pw; //회원 비밀번호
	private String mem_email; //회원 이메일
	private String mem_phone; //회원 폰번호
	private String mem_ticket; //회원이 구매한 티켓이름

	static {
		Member mem = new Member();
		mem.setMem_id("admin");
		mem.setMem_pw("1234");
		mem_list.add(mem);
	
		Member mem2 = new Member();
		mem2.setMem_id("user");
		mem2.setMem_pw("12345");
		mem2.setMem_name("사용자");
		mem2.setMem_phone("010-1234-1234");
		mem2.setMem_email("abc2@naver.com");
		mem_list.add(mem2);
	
	}
	
	public Member(){}
	
	public Member(String mem_id, String mem_name, String mem_pw, String mem_email, String mem_phone) {
		super();
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_pw = mem_pw;
		this.mem_email = mem_email;
		this.mem_phone = mem_phone;
	}
	public Member(String mem_id, String mem_name, String mem_pw, String mem_email, String mem_phone,
			String mem_ticket) {
		super();
		this.mem_id = mem_id;
		this.mem_name = mem_name;
		this.mem_pw = mem_pw;
		this.mem_email = mem_email;
		this.mem_phone = mem_phone;
		this.mem_ticket = mem_ticket;
	}
	

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getMem_name() {
		return mem_name;
	}

	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}

	public String getMem_pw() {
		return mem_pw;
	}

	public void setMem_pw(String mem_pw) {
		this.mem_pw = mem_pw;
	}

	public String getMem_email() {
		return mem_email;
	}

	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}

	public String getMem_phone() {
		return mem_phone;
	}

	public void setMem_phone(String mem_phone) {
		this.mem_phone = mem_phone;
	}
	public static List<Member> getMem_list() {
		return mem_list;
	}

	public static void setMem_list(List<Member> mem_list) {
		Member.mem_list = mem_list;
	}
	
	public String getMem_ticket() {
		return mem_ticket;
	}

	public void setMem_ticket(String mem_ticket) {
		this.mem_ticket = mem_ticket;
	}
	
	public static String getOn_id() {
		return on_id;
	}

	public static void setOn_id(String on_id) {
		Member.on_id = on_id;
	}
	
	
	public void view() {
		int num;
		while(true) {
			try {
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
		System.out.println("□                                      □");
		System.out.println("■                                      ■");
		System.out.println("□                                      □");
		System.out.println("■                                      ■");
		System.out.println("□   WATERMELONPLAYER에 오신 것을 환영합니다 □");
		System.out.println("■                                      ■");
		System.out.println("□                                      □");
		System.out.println("■                                      ■");
		System.out.println("□                                      □");
		System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
		
		
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
		num = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			signUp();
			break;
		case 2:
			login();
			break;
		}
			}catch(Exception e) {
				System.out.println("다시 입력해주세요.");
				sc.nextLine();
				continue;
			}
		}
	}
	
	public static void memView() {
		int num;
		int flag = 0;
		while(true) {
			try {
		System.out.println("♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥");
		System.out.println("♥                               ♥");
		System.out.println("♡                                                                              ♡");
		System.out.println("♥                               ♥");
		System.out.println("♡                                                                              ♡");
		System.out.println("♥     회원으로 오신 것을 환영합니다.  ♥");
		System.out.println("♡                                                                              ♡");
		System.out.println("♥                               ♥");
		System.out.println("♡                                                                              ♡");
		System.out.println("♥                               ♥");
		System.out.println("♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥♡♥");
		System.out.println("1. 마이페이지");
		System.out.println("2. 노래메뉴");
		System.out.println("3. 로그아웃");
		System.out.println("4. 이용권 구매");
		System.out.println("5. 이전메뉴");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("입력 : ");
		num = sc.nextInt();
		sc.nextLine();
		
		switch(num) {
		case 1:
			myPage();
			break;
		case 2:
			song.songView();
			break;
		case 3:
			logOut();
			break;
		case 4:
			ti.buyTicket();
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
				sc.nextLine();
				continue;
			}
		}
	}
	
	// 회원가입
	public static void signUp() {
		boolean check = false;
		Member m = new Member();

		while (true) {
			System.out.print("▷  ID를 입력하세요 : ");
			String id = sc.nextLine();
			// 중복검사
			for (int i = 0; i < mem_list.size(); i++) {
				if (mem_list.get(i).getMem_id().equals(id)) {
					System.out.println("중복된 아이디 입니다.");
					break;
				}
				if (i == mem_list.size() - 1) {
					check = true;
				}
			}

			if (check == true || mem_list.size() == 0) {
				m.setMem_id(id);
				break;
			}
		}

		while (true) {
			System.out.print("▷  이름을 입력하세요 : ");
			String name = sc.nextLine();
			if (Pattern.matches("^[가-힣]*$", name)) {
				m.setMem_name(name);
				break;
			} else {
				System.out.println("이름은 한글로 2~4자로 입력해주세요");
			}
		}

		while (true) {
			System.out.print("▷  비밀번호를 입력하세요(최대 8자) : ");
			String pw = sc.nextLine();
			if (pw.length() > 8) {
				System.out.println("비밀번호는 최대 8자 입니다.");
			} else {
				m.setMem_pw(pw);
				break;
			}
		}

		System.out.print("▷  이메일을 입력하세요 : ");
		m.setMem_email(sc.nextLine());

		while (true) {
			System.out.print("▷  폰번호를 입력하세요(-포함) : ");
			String phone = sc.nextLine();
			if (Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phone)) {
				m.setMem_phone(phone);
				break;
			}

		}

		mem_list.add(m);

	}

	// 로그인
	public static boolean login() {
		boolean checkId = false;
		boolean checkPw = false;
		boolean checkAll = false;

		while (true) {
			System.out.print("▷  아이디 : ");
			String id = sc.nextLine();
			for (int i = 0; i < mem_list.size(); i++) {

				if (mem_list.get(i).getMem_id().equals(id)) {
					checkId = true;
					on_id = id;
					System.out.print("▷  비밀번호를 입력해주세요 : ");
					String pw = sc.nextLine();
					if (mem_list.get(i).getMem_pw().equals(pw)) {
						checkPw = true;
						checkAll = true;
						on_pw = pw;
					} // if
					break;
				}

			}
			if (checkId == false) {
				System.out.println("아이디가 틀렸습니다. 다시 입력해주세요");
				continue;
			}

			if (checkPw == false) {
				System.out.println(" 비밀번호가 틀렸습니다. 다시입력해주세요");
				continue;
			} else if (checkPw == true) {
				if (id.equals("admin")) {
					admin.main();
				} else {
					memView();
				}
				break;
			}

		}

		return checkAll;
	}

	// 로그아웃
	public static void logOut() {
		System.out.println("로그아웃 하시겠습니까?");
		System.out.println("1.네 2.아니오");
		String answer = sc.nextLine();
		if (answer.equals("1")) {
			System.exit(0);
		}
	}

	// 마이페이지
	public static void myPage() {
		int idx = 0;
		boolean check = false;

		if (on_id == null || on_pw == null) {
			System.out.println("로그인이 필요합니다.");
		} else {
			for (int i = 0; i < mem_list.size(); i++) {
				if (mem_list.get(i).getMem_id().equals(on_id)) {
					idx = i;
					print(idx);
				}
			} // for

			System.out.println("수정하시겠습니까?");
			System.out.println("1.네 2.아니오");
			String answer = sc.nextLine();
			if (answer.equals("1") || answer.equals("네")) {
				System.out.println("▷ 입력할 항목을 선택해주세요");
				System.out.println("1.아이디 2.이름 3.비밀번호  4.이메일  5.핸드폰번호");
				String answer2 = sc.nextLine();
				switch (answer2) {
				case "1":
					while (true) {
						System.out.print("▷  ID를 입력하세요 : ");
						String id = sc.nextLine();
						// 중복검사
						for (int i = 0; i < mem_list.size(); i++) {
							if (mem_list.get(i).getMem_id().equals(id)) {
								System.out.println("중복된 아이디 입니다.");
								break;
							}
							if (i == mem_list.size() - 1) {
								check = true;
							}
						}

						if (check == true) {
							on_id = id;
							mem_list.get(idx).setMem_id(id);
							break;
						}
					}
					System.out.println("수정이 완료되었습니다!!");
					break;
				case "2":
					while (true) {
						System.out.print("▷  수정할 이름을 입력하세요 : ");
						String name = sc.nextLine();
						if (Pattern.matches("^[가-힣]*$", name)) {
							mem_list.get(idx).setMem_name(name);
							break;
						} else {
							System.out.println("이름은 한글로 2~4자로 입력해주세요");
						}
					}
					System.out.println("수정이 완료되었습니다!!");
					break;
				case "3":
					while (true) {
						System.out.print("▷  수정할 비밀번호를 입력하세요(최대 8자) : ");
						String pw = sc.nextLine();
						if (pw.length() > 8) {
							System.out.println("비밀번호는 최대 8자 입니다.");
						} else {
							mem_list.get(idx).setMem_pw(pw);
							break;
						}
					}
					System.out.print("수정이 완료되었습니다!!");
					System.out.println();
					break;
				case "4":
					System.out.print("▷  수정할 이메일을 입력하세요 : ");
					mem_list.get(idx).setMem_email(sc.nextLine());
					System.out.println(" 수정이 완료되었습니다!!");
					break;
				case "5":
					while (true) {
						System.out.println("▷  폰번호를 입력하세요(-포함)");
						String phone = sc.nextLine();
						if (Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phone)) {
							mem_list.get(idx).setMem_phone(phone);
							break;
						}

					}
					System.out.println("수정이 완료되었습니다!!");
					break;

				} // switch
			}else if(answer.equals("2") || answer.equals("아니오")){
				return;
			}else {
				System.out.println("잘 못 입력하셨습니다.");
			}
		} // else
	}

	// 출력
	public static void print(int idx) {
		System.out.println("━━━━━━━━━━━━━━My Page━━━━━━━━━━━━━━━━━");
		System.out.println("> 아이디    : " + mem_list.get(idx).getMem_id());
		System.out.println("> 이   름    : " + mem_list.get(idx).getMem_name());
		System.out.println("> 비밀번호 : " + mem_list.get(idx).getMem_pw());
		System.out.println("> 이메일    : " + mem_list.get(idx).getMem_email());
		System.out.println("> 핸드폰번호 : " + mem_list.get(idx).getMem_phone());
		if(mem_list.get(idx).getMem_ticket() == null) {
			System.out.println("> 구매한 티켓 : 없음");
		}else {
			System.out.println("> 구매한 티켓" + mem_list.get(idx).getMem_ticket());
		}
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
	}

}
